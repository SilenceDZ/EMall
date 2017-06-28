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
			if(rs.next()){
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
	private static <T> boolean hasField(Class<T> cls, String columnName){
		Field[] fields=cls.getDeclaredFields();
		for (Field field : fields) {
			if(field.getName().equals(columnName)){
				return true;
			}
		}
		return false;
	}
}
