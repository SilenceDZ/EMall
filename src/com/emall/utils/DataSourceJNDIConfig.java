package com.emall.utils;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DataSourceJNDIConfig {
	public static Connection getConnection(){
		Connection conn=null;
		Context ctx=null;
		try {
			ctx=new InitialContext();
			ctx=(Context) ctx.lookup("java:comp/env");
			DataSource ds=(DataSource) ctx.lookup("oracle/xe");
			//oracle.jdbc.driver.T4CConnection.isValid(I)Z--->驱动版本太旧
			//更新版本解决
			conn=ds.getConnection();
			//如果要测试,不能在application中运行,需要web浏览器的参与!!!
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
