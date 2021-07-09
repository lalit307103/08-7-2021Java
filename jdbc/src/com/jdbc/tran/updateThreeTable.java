package com.jdbc.tran;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.oracle.util.GetMyOracleConnection;

public class updateThreeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 	 Connection conn = null;
			      try
			    {
			    	conn = GetMyOracleConnection.getMyOracleConn();
			    	Statement st= conn.createStatement();
			    	
			    	st.addBatch("insert into flight values(103,100)");
			     	st.addBatch("insert into acct values(6,100)");
			        st.addBatch("insert into charges values(104,40000 )");
			     //	st.addBatch("update charges set fli_charges=50000 where fli_id=104");
			    	
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


