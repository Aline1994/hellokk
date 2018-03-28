package com.bonc.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;

import org.apache.log4j.Logger;

//url=jdbc:zx://localhost:port/database
public class ZDriver implements Driver {
	Logger log = Logger.getLogger(ZDriver.class.getName());
	/**
	 * 注册ZDriver
	 */
	public ZDriver(){}
	static{
		try {
			DriverManager.registerDriver(new ZDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection connect(String url, Properties info) throws SQLException {
		if(acceptsURL(url)){
			
		}
		return null;
	}
	public boolean acceptsURL(String url) throws SQLException {
		if(url!=null){
			if(url.startsWith("jdbc:zxx")){
				return true;
			}
		}
		return false;
	}
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		DriverPropertyInfo [] dpt = null;
		String [] urls = url.split(":");
		if(info==null){
			info = new Properties();
		}
		for(String u:urls){
			
		}
		return null;
	}
	public int getMajorVersion() {
		return 1;
	}
	public int getMinorVersion() {
		return 1;
	}
	/**
	 * 获取pom文件的版本号
	 */
	
	/**
	 * 
	 */
	
	
	
	
	
	
	
	
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}
	public java.util.logging.Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
