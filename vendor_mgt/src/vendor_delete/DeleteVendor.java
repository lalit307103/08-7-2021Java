package vendor_delete;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.utility.VendorJdbcConnection;
import com.utility.displaymsg.DisplayMessage;
import com.utility.input.console.ReadData_Console;

import oracle.jdbc.pool.OracleDataSource;

public class DeleteVendor {
public void deleteVendor() 
{

	Connection conn;
	PreparedStatement prp;
	ReadData_Console rd = new ReadData_Console();
	  String qry = "select * from vendor where vid=?";
	  String qry2 = "delete from vendor where vid= ? ";
     	DisplayMessage.displayMessage("Vendor id You Want to Delete");
	    String delete_id=rd.getDataFromConsole();
	    conn = VendorJdbcConnection.getVendorConnection();
       
	   
	    try {
	     	prp=conn.prepareStatement(qry);
	    	//prp.setInt(1,id);
	     	prp.setString(1,delete_id);
	    	  	int row=prp.executeUpdate();
	    	if(row > 0) {
	    		System.out.println(" Vendor Id is available");
	    		System.out.println("=============================");
	    		prp=conn.prepareStatement(qry2);
		    	 prp.setString(1,delete_id);
		    	  	int row1=prp.executeUpdate();
		    	  	if(row1 > 0)
		    	  	{
		    	  		System.out.println(" Vendor Id Is Delete Successfully");
		    	  	System.out.println("===================================");
		    	  	}
		    	  	else {
		    	  		System.out.println(" Vendor is not Delete");
		    	  	System.out.println("===================================");
		    	  	}
	    	}
	    		else {
					System.out.println("Vendor id is not available");
				System.out.println("===================================");
	    		}	 
	    	}
	    	
catch (Exception e) {
	// TODO: handle exception
}
 }
	 
		
		 
}
