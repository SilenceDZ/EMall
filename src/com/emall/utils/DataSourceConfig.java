package com.emall.utils;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @className:DataSourceConfig
 * @author fatlamb
 * @description:c3p0数据库连接池配置类
 * @date 2017年6月28日
 *
 */
public class DataSourceConfig {
	private static final String URL="jdbc:oracle:thin:@local:1521:xe";
	private static final String USERNAME="emall";
	private static final String PASSWORD="emall";
	private static final String DRIVER="oracle.jdbc.driver.OracleDriver";
	
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
