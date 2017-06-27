package com.emall.utils;

import javax.sql.DataSource;

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
		}
		
	}
	
}
