package vendor_update;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.utility.VendorAuthentication;
import com.utility.VendorJdbcConnection;

import oracle.jdbc.pool.OracleDataSource;
import vendor_id_genrate.GengerateID;

public class UpdateMobVendor {
	 
	public void updateVendorMob(String id) {
	
	BufferedReader bRead;// use to read data from console
	
	PrintStream pS;// use to display msg on console
	 
	Connection con;
	PreparedStatement prp;
	String qry="update vendor set vmob=? where vid=?";
	OracleDataSource ods;
	try {

	    bRead = new BufferedReader(new InputStreamReader(System.in));// read the data from console
		pS = new PrintStream(System.out); 
		 	  
		pS.println("Enter Vendor Changed Mobile Number");
		String vendor_Mobno = bRead.readLine();

		
		con=VendorJdbcConnection.getVendorConnection();
		prp=con.prepareStatement(qry);
		 
		//setting the IN parameters
		prp.setString(1,vendor_Mobno);
		prp.setString(2,id);
		  
		int row=prp.executeUpdate();  //executing query
		if(row>0)
		
		 pS.println(" Vendor Mob no. is Updated Successfully ...");
			  
			
	} // End Most Outer tryblock
	 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
catch(Exception e) {
e.printStackTrace();
}
	}  

}
