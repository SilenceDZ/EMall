package com.emall.utils;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;


public class Dbutils {	
	public static Connection getConnection(){
		Connection conn=null;
		try {
			//原来使用JDBC来连接数据库
			/*Class.forName(ORACLE_DRIVE);
			conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);*/
			//使用c3p0数据库连接池连接数据库
			conn=DataSourceConfig.getDataSource().getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeStream(AutoCloseable stream){
		if(stream!=null){
			try {
				stream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	public static void close(Connection conn,Statement stat,ResultSet rs){
		closeStream(conn);
		closeStream(stat);
		closeStream(rs);
	}
	public static void close(Connection conn,Statement stat){
		closeStream(conn);
		closeStream(stat);
	}
}
