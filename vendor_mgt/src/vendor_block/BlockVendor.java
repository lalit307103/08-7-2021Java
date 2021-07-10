package vendor_block;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.utility.VendorJdbcConnection;
import com.utility.displaymsg.DisplayMessage;
import com.utility.input.console.ReadData_Console;

public class BlockVendor {
	Connection conn;
	PreparedStatement prp;
	ReadData_Console rd = new ReadData_Console();
	 String qry = "select * from vendor where vid=?";
     String qry2 = "update vendor set vstatus = 'block' where vid =?";
   public void blockVendor() {
		DisplayMessage.displayMessage("Vendor id You Want to Block");
	    String block_id=rd.getDataFromConsole();
	    conn = VendorJdbcConnection.getVendorConnection();
       
	   
	    try {
	     	prp=conn.prepareStatement(qry);
	    	//prp.setInt(1,id);
	     	prp.setString(1,block_id);
	    	  	int row=prp.executeUpdate();
	    	if(row > 0) {
	    		System.out.println(" Vendor Id is available");
	    		System.out.println("=============================");
	    		prp=conn.prepareStatement(qry2);
		    	//prp.setInt(1,id);
		     	prp.setString(1,block_id);
		    	  	int row1=prp.executeUpdate();
		    	  	if(row1 > 0)
		    	  	{
		    	  		System.out.println(" Vendor Id Is Block Successfully");
		    	  	System.out.println("===================================");
		    	  	}
		    	  	else {
		    	  		System.out.println(" Vendor is not Block");
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


