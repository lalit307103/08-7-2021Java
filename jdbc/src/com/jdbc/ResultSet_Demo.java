
package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class ResultSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		//String qry="select*from student";
	//	String qry2="select eid,ename,bsal from student where sid=?";
	   String qry2="select * from student where sid=?"; 
		PreparedStatement prp;
		ResultSet rs;
		OracleDataSource ods;
		try {
			ods=new OracleDataSource();
			ods.setUser("system");
			ods.setPassword("test");
			ods.setDriverType("thin");
			ods.setPortNumber(1521);
			ods.setDatabaseName("xe");
			ods.setServerName("localhost");
			
			con=ods.getConnection();
			
			//prp=con.prepareStatement(qry);
			//rs=prp.executeQuery(); //select a query method accrding to query
			prp=con.prepareStatement(qry2);
			
			//looping through the result set
			//set IN parameters
			 prp.setInt(1,Integer.parseInt(args[0]));
			rs=prp.executeQuery();
			while(rs.next())
				
				System.out.println("row no-id and name "+rs.getRow()+" "+rs.getInt(1)+" "+rs.getString("sname"));
			
			/*if(rs.next())
				System.out.println("name is "+rs.getString("sname"));
			else
				System.out.println("row is not selected");*/
		}
		catch (Exception e){
			e.printStackTrace();
			
		}
		

	}

}
