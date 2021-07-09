package com.jdbc.tran.prepstatment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.StringTokenizer;

 
import com.jdbc.oracle.util.GetMyOracleConnection;
;

public class InsertBatchPreStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement prp;
		String qry1="insert into acct values(?,?)";
		 
     try {
		conn=GetMyOracleConnection.getMyOracleConn();
		prp=conn.prepareStatement(qry1);
	 	FileReader fr = new FileReader("readPrep.txt");
		BufferedReader br = new BufferedReader(fr);
		StringTokenizer st;
		String data=br.readLine();
	    conn.setAutoCommit(false);//that by defalult value is true
			
		while(data!=null) {
			st = new StringTokenizer(data,"#");
			while(st.hasMoreElements()) {
			
			 int id=Integer.parseInt(st.nextToken());
			 int bal=Integer.parseInt(st.nextToken());
			
			 prp.setInt(1,id);
			 prp.setInt(2,bal);
			 
			}
			 data= br.readLine();
			 prp.addBatch();
			 prp.executeBatch();
			 conn.commit();
			 	
		}
     } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (Exception e) {
		// TODO: handle exception
		 try {
			conn.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
     
	}

}
