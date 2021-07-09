package com.jdbc.tran;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.oracle.util.GetMyOracleConnection;

public class BatchInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String qry1="insert into acct values(4,100)";
		String qry2="insert into acct values(5,200)";
		String qry3="insert into acct values(6,300)";
		  
		Connection conn = null ;
		 		 try {
			 //get the connection object
				
		     conn=GetMyOracleConnection.getMyOracleConn();
		     Statement st=  conn.createStatement();
		     conn.setAutoCommit(false);
				
		     
		     st.addBatch(qry1);
		     st.addBatch(qry2);
		     st.addBatch(qry3);
		    st.executeBatch();
		   	
				 conn.commit();
				 
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


