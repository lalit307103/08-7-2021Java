package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jdbc.oracle.util.GetMyOracleConnection;

import oracle.jdbc.pool.OracleDataSource;

public class DataSource_PS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		PreparedStatement prp;
		//String qry="insert into student values(?,?)"; //?? are values at run time
		String qry="select * from student where sid=1";
		OracleDataSource ods;
		try {
			//create an object for ODS
		/*	ods=new OracleDataSource();
			//injecting the appropriate values
			ods.setUser("system");
			ods.setPassword("test");
			ods.setPortNumber(1521);
			ods.setDriverType("thin");
			ods.setServerName("localhost");
			ods.setDatabaseName("xe");
			con=ods.getConnection(); //get the connection
			*/
			con=GetMyOracleConnection.getMyOracleConn();
			prp=con.prepareStatement(qry);
			//setting the IN parameters
			prp.setInt(1,Integer.parseInt(args[0]));
			//prp.setString(2, args[1]);
			int row=prp.executeUpdate();  //executing query
			if(row>0)
				System.out.println("sucess");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
