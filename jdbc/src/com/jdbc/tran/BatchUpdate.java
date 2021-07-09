package com.jdbc.tran;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.oracle.util.GetMyOracleConnection;
 

public class BatchUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Connection conn;
   String qry1="update  acct set bal = 16000 where acc_id=4";
   conn = GetMyOracleConnection.getMyOracleConn();
	
   try
    {
    	Statement st= conn.createStatement();
    	
    	st.addBatch(qry1);
    	st.addBatch("update  acct set bal = 12000 where acc_id=5");
    	st.addBatch("update  acct set bal = 33000 where acc_id=15");
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
