package com.emall.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
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
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			Dbutils.close(conn, ps);
		}
		return 0;
	}
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
