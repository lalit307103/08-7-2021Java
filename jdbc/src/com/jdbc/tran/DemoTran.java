package com.jdbc.tran;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

 

import com.jdbc.oracle.util.GetMyOracleConnection;

public class DemoTran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String qry1="update acct set bal=bal-? where acc_id =?";
 String qry2="update flight set seats =seats- ? where fli_id=?";
 Connection conn = null;
 PreparedStatement prp1,prp2;
 
 try {
	 //get the connection object
	 conn=GetMyOracleConnection.getMyOracleConn();
	 
	 //set the auto commit feature to false
	 conn.setAutoCommit(false);//that by defalult value is true
	 prp1 = conn.prepareStatement(qry1);
	// prp2 =conn.prepareStatement(qry2); // using only one prepared statement ..memory optimazation,
	 //setting the  IN parameter
	 
	 prp1.setInt(1,100);//value 100,id =1;
	 prp1.setInt(2,1);
	 int r1 = prp1.executeUpdate();
	 
	prp1= null;// null is resetting the prp1 ...that override if not given that good practice to initialisation
	 prp1= conn.prepareStatement(qry2);
	 
	 //setting the IN  parameter
	 
	 prp1.setInt(1,10);//seats1000;
	 prp1.setInt(2,101);
	 
	  int r2=prp1.executeUpdate();
	 
	 if(r1 > 0 && r2>0)
	 {
		 System.out.println("transaction successful");
		 
		 // commit the transaction 
		 
		 conn.commit();
		 
	 }
 }
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		
		try {
			conn.rollback();
		}
		catch (SQLException s) {
			// TODO: handle exception
			s.printStackTrace();
		}
	}
 
	}

}
