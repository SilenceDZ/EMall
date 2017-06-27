package com.emall.utils;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSourceConfig {
	private static final String URL="";
	private static final String USERNAME="";
	private static final String PASSWORD="";
	private static final String DRIVER="";
	
	private static DataSource dataSource;
	
	public static DataSource getDataSource(){
		if(dataSource==null){
			initialization();
		}
		return dataSource;
	}
	public static void initialization(){
		if(dataSource!=null){
			//如果不为空，则关闭
			((ComboPooledDataSource)dataSource).close();
		}
		ComboPooledDataSource tempDataSource =new ComboPooledDataSource();
		
		try{
			tempDataSource.setDriverClass(DRIVER);
			tempDataSource.setUser(USERNAME);
			tempDataSource.setJdbcUrl(URL);
			tempDataSource.setPassword(PASSWORD);
			//设置超时时间
			tempDataSource.setCheckoutTimeout(8000);
			//重新指向新对象
			dataSource=tempDataSource;
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
