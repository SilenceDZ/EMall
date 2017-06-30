package com.emall.utils;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.emall.bean.PageModel;

/**
 * @className:BaseDao
 * @author fatlamb
 * @description:数据库查询基础类
 * @date 2017年6月28日
 *
 */
public class BaseDao {
	/**
	 * @Title:baseUpdate
	 * @Description:数据库更新操作
	 * @param sql sql语句
	 * @param params sql语句中的参数
	 * @return int
	 * @throws SQLException
	 */
	public static int baseUpdate(String sql,Object ...params){
		Connection conn=null;
		PreparedStatement ps=null;
		conn=Dbutils.getConnection();	
		try {
			ps=conn.prepareStatement(sql);
			if(params!=null){
				int i=1;
				//ps中的参数是从1开始的！！！
				for (Object obj : params) {
					ps.setObject(i++, obj);
				}
			}
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Dbutils.close(conn, ps);
		}
		return 0;
	}
	/**
	 * @Title:queryForCount
	 * @Description:数量查询
	 * @param sql sql语句
	 * @param params sql语句中的参数
	 * @return int
	 * @throws SQLException
	 */
	public static int queryForCount(String sql,Object ...params){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		conn=Dbutils.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			if(params!=null){
				int i=1;
				for (Object obj : params) {
					ps.setObject(i++, obj);
				}
			}
			rs=ps.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Dbutils.close(conn, ps, rs);
		}
		return 0;
	}
	/**
	 * @Title:queryForSingle
	 * @Description:查询当个实体类
	 * @param sql 数据库查询语句
	 * @param cls 目标实体类
	 * @param params 可变参数
	 * @return 查询实体类的对象
	 * @throws Exception 
	 */
	public static <T> T queryForSingle(String sql,Class<T> cls,Object ...params){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		conn=Dbutils.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			if(params!=null){
				int i=1;
				for (Object obj : params) {
					ps.setObject(i++, obj);
				}
			}
			rs=ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int columnCount=rsmd.getColumnCount();
			//使用了反射实现与普通实现的区别
			if(rs.next()){
				//通过反射创建需要返回的类
				T obj=cls.newInstance(); 
				for(int i=0;i<columnCount;i++){
					String columnName=rsmd.getColumnName(i+1).toLowerCase();
					Object value=rs.getObject(columnName);
					if(value==null){
						continue;
					}
					//判断获取的字段在JavaBean中是否存在其对应的成员属性
					if(hasField(cls, columnName)){
						Field f=cls.getDeclaredField(columnName);
						f.setAccessible(true);
						//处理特殊数据类型
						if(value instanceof BigDecimal){
							BigDecimal val=(BigDecimal) value;
							if(f.getType().getName().equals("int")){
								f.set(obj, val.intValue());
							}else{
								f.set(obj, val.doubleValue());
							}
						}
						else if(value instanceof String){
							char val=((String) value).toCharArray()[0];
							if(f.getType().getName().equals("char")){
								f.set(obj, val);
							}else{
								f.set(obj, value);
							}
						}else{
							f.set(obj, value);
						}
						
					}
				}
				return obj;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			Dbutils.close(conn, ps, rs);
		}
		return null;
	}
	/**
	 * @Title:baseQuery
	 * @Description:查询实体类集合
	 * @param sql 查询语句
	 * @param cls 实体类
	 * @param params 可变参数
	 * @return 查询对象的数据集合
	 * @throws Exception
	 */
	public static <T> List<T> baseQuery(String sql,Class<T> cls,Object ...params){
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<T> list=new ArrayList<>();
		conn=Dbutils.getConnection();
		
		try {
			ps=conn.prepareStatement(sql);
			if(params!=null){
				int i=1;
				for (Object obj : params) {
					ps.setObject(i++, obj);
				}
			}
			rs=ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int columnCount=rsmd.getColumnCount();
			//使用了反射实现与普通实现的区别
			while(rs.next()){
				//通过反射创建需要返回的类
				T obj=cls.newInstance(); 
				for(int i=0;i<columnCount;i++){
					String columnName=rsmd.getColumnName(i+1).toLowerCase();
					Object value=rs.getObject(columnName);
					if(value==null){
						continue;
					}
					if(hasField(cls, columnName)){
						Field f=cls.getDeclaredField(columnName);
						f.setAccessible(true);
						//处理特殊数据类型
						//因为在oracle数据库中int类型时以浮点类型保存的,所以需要根据JavaBean的具体数据类型来转换类型
						if(value instanceof BigDecimal){
							BigDecimal val=(BigDecimal) value;
							if(f.getType().getName().equals("int")){
								f.set(obj, val.intValue());
							}else{
								f.set(obj, val.doubleValue());
							}
						}
						else if(value instanceof String){
							char val=((String) value).toCharArray()[0];
							if(f.getType().getName().equals("char")){
								f.set(obj, val);
							}
							else{
								f.set(obj, value);
							}
						}else{
							f.set(obj, value);
						}						
					}
				}
				list.add(obj);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			Dbutils.close(conn, ps, rs);
		}
		return null;
	}
	/**
	 * @Title:hasField
	 * @Description:判断实体类是是否有columnName的属性
	 * @param cls 实体类
	 * @param columnName 属性名
	 * @return boolean
	 * @throws 
	 */
	private static <T> boolean hasField(Class<T> cls, String columnName){
		Field[] fields=cls.getDeclaredFields();
		for (Field field : fields) {
			if(field.getName().equals(columnName)){
				return true;
			}
		}
		return false;
	}
	private static final String PAGE_SQL_START = " select t2.* from ( select t1.*,rownum num from ( ";
	private static final String PAGE_SQL_END = " ) t1 where rownum<=? ) t2 where num>=? ";
	
	/**
	 * @Title:queryPageModel
	 * @Description:TODO
	 * @param querySql 确定数据源     select * from (tableName)
	 * @param countSql 统计数据源中有多少条数据  select count(1) from (tableName)
	 * @param whereSql 查询的条件
	 * @param ohterSql 查询后的数据进行排序  不需要这个条件时传null  order by (columnName) desc
	 * @param cls 查询的实体类
	 * @param currentPage 当前页面
	 * @param pageSize 页面大小
	 * @param params Sql查询语句
	 * @return
	 * @throws
	 */
	public static <T> PageModel<T> queryPageModel(StringBuffer querySql, StringBuffer countSql,
			StringBuffer whereSql,StringBuffer otherSql,Class<T> cls, 
			int currentPage, int pageSize, List<Object> params) {
		//获取数据库中表中的总记录数
		countSql.append(whereSql); // select count(1) from t_mc where mcid>20
		int totalCount = queryForCount(countSql.toString(), params.toArray());	
		//拼接分页查询的SQL语句querySql
		querySql.append(whereSql);  //拼接上查询条件
		//加上otherSql查询就从最后开始 因为order by desc 是降序
//		querySql.append(otherSql);
		if(otherSql!=null){
			querySql.append(otherSql);
		}
		querySql.insert(0, PAGE_SQL_START); //在querySql字符串之前插入一个字符串PAGE_SQL_START
		querySql.append(PAGE_SQL_END); //在querySql字符串后面追加字符串PAGE_SQL_END
		//根据获取到参数计算开始下标和结束下标
		int startIndex = pageSize*(currentPage-1)+1;
		int endIndex = pageSize*currentPage;
		//System.out.println(startIndex+","+endIndex);
		//将计算好的下标保存到params集合中  保存的顺序不要反了
		params.add(endIndex);
		params.add(startIndex);
		//查询分页的数据
		List<T> list = baseQuery(querySql.toString(), cls, params.toArray());
		//将查询出来的数据保存到PageModel中
		PageModel<T> pageModel = new PageModel<T>();
		pageModel.setCurrentPage(currentPage);
		pageModel.setPageSize(pageSize);
		pageModel.setTotalCount(totalCount);
		pageModel.setResult(list);
		return pageModel;
	}
}
