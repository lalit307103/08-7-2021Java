package com.jdbc.oracle.util;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class GetMyOracleConnection {
	static Connection con;
	static OracleDataSource ods;
	
	public GetMyOracleConnection() {
		
	}
	
	//get the connection
	public static Connection getMyOracleConn() {
		try {
			ods=new OracleDataSource();
			//set the properties
			ods.setUser("system");
			ods.setPassword("test");
			ods.setDatabaseName("xe");
			ods.setServerName("localhost");
			ods.setPortNumber(1521);
			ods.setDriverType("thin");
			con=ods.getConnection();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
		
		
	}

}
