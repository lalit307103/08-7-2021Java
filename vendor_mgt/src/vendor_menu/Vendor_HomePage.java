package vendor_menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.lvendor_ListOut.Vendor_List_Out;
import com.utility.VendorAuthentication;

import vendor_block.BlockVendor;
import vendor_delete.DeleteVendor;
import vendor_search.VendorSearch;
import vendor_signup.VsignUp;

public class Vendor_HomePage {
	 VsignUp vs = new VsignUp();
     VendorAuthentication vath = new VendorAuthentication();
     BlockVendor bv = new BlockVendor();
     DeleteVendor dv = new DeleteVendor();
     VendorSearch vS = new VendorSearch();
     Vendor_List_Out vlst =new Vendor_List_Out();
		
	public void vendorHomePage() {
		BufferedReader br= new BufferedReader(new InputStreamReader(System .in ));
		try {
			// TODO Auto-generated method stub
			System.out.println("=======================");
			System.out.println("Vendor Managment");
			System.out.println("=======================");
			System.out.println("1.Vendor SignUp");
			System.out.println("2.Update");
			System.out.println("3.Block Vendor");
			System.out.println("4.Search ");
			System.out.println("5.List of Vendor ");
			System.out.println("6.Delete ");
			System.out.println("7.Exit ");
			System.out.println("=======================");
			
			String sIN = null;
		 	System.out.println("Enter your choice:...[1..To...7]");
				
		 	sIN = br.readLine();
			
			 
			switch (sIN) {
			case "1": vs.vendor_signup(); ;
				 	
				break;

			case "2":vath.checkVendorValidation();
			 	break; 

			case "3":bv.blockVendor();
			        break;
			       // Block vendor ;
			
			case "4":vS.vendorserch();
				     break;
			         // Serach;
				
			case "5": vlst.get_VendorList("Select*from vendor where vstatus='A'");//list of vendor;
						break;
			
			case "6": dv.deleteVendor();
			          break;
			         //delete vendor;
			case "7": System.exit(0);
				    //exit;
			        break;
			default:
				System.out.println("Input is not Valid....");
				System.exit(0);
				break;
	}
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
			 
		
		} 	
}
