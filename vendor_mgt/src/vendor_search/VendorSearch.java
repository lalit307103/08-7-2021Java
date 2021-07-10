package vendor_search;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lvendor_ListOut.Vendor_List_Out;
import com.utility.VendorJdbcConnection;
import com.utility.displaymsg.DisplayMessage;
import com.utility.input.console.ReadData_Console;

public class VendorSearch {
	Vendor_List_Out vl=new Vendor_List_Out();
	public void vendorserch()
	{
		  ResultSet rs ;
			 
		Connection conn;
		PreparedStatement prp;
		ReadData_Console rd = new ReadData_Console();
		  String qry = "select * from vendor where vid=?";
		  	DisplayMessage.displayMessage("Vendor id You Want to Search");
		    String search_id=rd.getDataFromConsole();
		    conn = VendorJdbcConnection.getVendorConnection();
	       
		    try {
		    	
		     	prp=conn.prepareStatement(qry);
		    	prp.setString(1,search_id);
		    	  	int row=prp.executeUpdate();
		    	if(row > 0) {
		    		System.out.println(" This ID Vendor Is available");
		    		System.out.println("=============================");
		    		vl.get_VendorList("select* from vendor where vstatus= 'A'and vid="+search_id);
		    		  	 
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


