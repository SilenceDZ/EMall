package com.emall.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BaseDao {
	public static int baseUpdate(String sql,Object ...params){
		Connection conn=null;
		PreparedStatement ps=null;
		conn=Dbutils.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			if(params!=null){
				int i=0;
				for (Object obj : params) {
					ps.setObject(i+1, obj);
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
}
