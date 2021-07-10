package vendor_signup;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.utility.VendorJdbcConnection;

import oracle.jdbc.pool.OracleDataSource;
import vendor_id_genrate.GengerateID;

public class VsignUp {
	GengerateID id_gnrt = new GengerateID();

     public void vendor_signup() //  registration
	   {   
    	 Connection con=VendorJdbcConnection.getVendorConnection();
 		 PreparedStatement prp;
    	 
    	BufferedReader bRead;// use to read data from console
		PrintStream pS;// use to display msg on console
		
		
		String qry="insert into vendor values(?,?,?,?,?,?,?)"; //?? are values at run time
	    	
		try {
			 prp=con.prepareStatement(qry);
																									// existing
			// or overwritten if existing
			bRead = new BufferedReader(new InputStreamReader(System.in));// read the data from console
			pS = new PrintStream(System.out);// use like Sysout
			pS.println("==================");
			pS.println(" Vendor SignUp Module");
			pS.println("==================");
			
		 	String vendor_Id =id_gnrt.readCurrentId();
			id_gnrt.get_Id_Increament();

			pS.println("1)Enter Vendor Name");
			String vendor_Name = bRead.readLine();

			pS.println("2)Mobile Number");
			String vendor_MobNo = bRead.readLine();

			pS.println("3)Enter List of Items");
			String vendor_items = bRead.readLine();

			pS.println("4)Enter Vendor Address");
			String vendor_address = bRead.readLine();
			

			pS.println("5)Enter PinCode");
			String vendor_pinCode = bRead.readLine();
			
			//pS.println("Enter Status");
			String vendor_Status = "A";
			
			
			pS.println(" Vendor SignUp is Successfully ..Your ID is:"  +vendor_Id + " ] ,Plese Note it...");
			pS.println("===============================================================                     ");
			 
			
			  
			//setting the IN parameters
			prp.setString(1,vendor_Id);
			prp.setString(2,vendor_Name);
			prp.setString(3,vendor_MobNo);
			prp.setString(4,vendor_items);
			prp.setString(5,vendor_address);
			prp.setString(6,vendor_pinCode);
			prp.setString(7,vendor_Status);
			
				
			int row=prp.executeUpdate();  //executing query
			 
			if(row>0)
				System.out.println("Your Record  Save sucessfully");
		} // End Most Outer tryblock
		 catch (SQLException e) {//thats the children first
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
catch(Exception e) {//father of exception
	e.printStackTrace();
}
		

		 
		}  
	} 

