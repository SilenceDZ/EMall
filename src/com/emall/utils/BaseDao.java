package com.emall.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
