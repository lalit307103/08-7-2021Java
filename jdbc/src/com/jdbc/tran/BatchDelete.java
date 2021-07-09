package com.jdbc.tran;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.oracle.util.GetMyOracleConnection;

public class BatchDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection conn = null;
		    String qry1=" delete acct where acc_id=5";
		    try
		    {
		    	conn = GetMyOracleConnection.getMyOracleConn();
		    	Statement st= conn.createStatement();
		    	
		    	st.addBatch(qry1);
		     	st.addBatch("delete acct where acc_id=6");
		    	st.executeBatch();
		    	conn.setAutoCommit(false);
		        
		    	conn.commit();
		    }
		    catch (Exception e) {
				// TODO: handle exception
		    	e.printStackTrace();
		    	try {
		    		conn.rollback();
		    	}
		    	catch (SQLException sql) {
					// TODO: handle exception
		    		sql.printStackTrace();
				}
			}
				
				
			}
	
	}

