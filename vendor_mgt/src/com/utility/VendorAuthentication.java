package com.utility;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.UnmappableCharacterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import oracle.jdbc.pool.OracleDataSource;
import vendor_update.UpdateMobVendor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public class VendorAuthentication {
UpdateMobVendor uVendor = new UpdateMobVendor();
 public void checkVendorValidation(){

	 	// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System .in));
		
	    Connection con;      
		String qry2="select * from vendor where vid=?"; 
		PreparedStatement prp;
		ResultSet rs;
		OracleDataSource ods;
		try {
			System.out.println("Please Enter Vendor id :");
		     
			String id=br.readLine();
			
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
			 prp.setString(1,id);
			rs=prp.executeQuery();
			/*while(rs.next())
			      
				System.out.println("Vendor is Valid ");
			*/	 
			
			if(rs.next())
				{
				System.out.println(" Vendor Id is Valid");
			System.out.println("================================");	
			    uVendor.updateVendorMob(id);
				}
			else
				System.out.println("Vendor Is Not Valid");
			System.out.println("================================");	
			
		}
		catch (Exception e){
			 e.printStackTrace();
			
		}
		

	}

}

