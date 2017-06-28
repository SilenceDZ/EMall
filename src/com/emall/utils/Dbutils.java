package com.emall.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @className:Dbutils
 * @author fatlamb
 * @description:数据库工具类
 * @date 2017年6月28日
 *
 */
public class Dbutils {	
	/**
	 * @Title:getConnection
	 * @Description:获取数据库连接对象
	 * @return Connection
	 * @throws SQLException 
	 */
	public static Connection getConnection(){
		Connection conn=null;
		try {
			//原来使用JDBC来连接数据库
			/*Class.forName(ORACLE_DRIVE);
			conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);*/
			//使用c3p0数据库连接池连接数据库
			conn=DataSourceConfig.getDataSource().getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return conn;
	}
	
	/**
	 * @Title:closeStream
	 * @Description:关闭单个资源流
	 * @param stream 要关闭的资源
	 * @return void
	 * @throws Exception
	 */
	private static void closeStream(AutoCloseable stream){
		if(stream!=null){
			try {
				stream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
	/**
	 * @Title:close
	 * @Description:关闭无需使用的资源
	 * @param conn 数据库链接
	 * @param stat Statement对象
	 * @param rs ResultSet对象
	 * @return void
	 * @throws Exception
	 */
	public static void close(Connection conn,Statement stat,ResultSet rs){
		closeStream(conn);
		closeStream(stat);
		closeStream(rs);
	}
	/**
	 * @Title:close
	 * @Description:关闭无需使用的资源
	 * @param conn 数据库链接
	 * @param stat Statement对象
	 * @return void
	 * @throws Exception
	 */
	public static void close(Connection conn,Statement stat){
		closeStream(conn);
		closeStream(stat);
	}
}
