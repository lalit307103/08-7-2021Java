package com.utility;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

 public class VendorJdbcConnection {
 static Connection con;
 static OracleDataSource ods;
 public VendorJdbcConnection() {
	 
 }
 
 //get connection
 
 public static Connection getVendorConnection() {
	 try {
		 ods = new OracleDataSource();
		 
		 // set the properties
		 ods.setUser("system");
		 ods.setPassword("test");
		 ods.setDatabaseName("xe");
		 ods.setServerName("localhost");
		 ods.setDriverType("thin");
		 ods.setPortNumber(1521);
		 con = ods.getConnection();
		 
	 }
	 catch (Exception e) {
		// TODO: handle exception
		 e.printStackTrace();
	}
	 return con;
 }
	 
	}


