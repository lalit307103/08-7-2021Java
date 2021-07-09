package com.signinmodule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.StringTokenizer;

import com.homepage.ForHome_Page;
import com.signup_module.Sign_Up;

public class Deposit_Module {
	//module to take deposit amnt and change this amount with earlier amount 
	BufferedReader br;
	public Deposit_Module() {
		
	}
	FileReader fr;
	BufferedReader br1;
	StringTokenizer st;
	Date date=new Date();
	String date1=String.valueOf(date);
	Sign_Up sg=new Sign_Up();
	//String d_bal=null;
	
	
	
	public void customerMoney_Deposition(String id,int deposit ) {
		try {
			fr=new FileReader("E:/MasterFile.txt");
			br=new BufferedReader(fr);
			String data = br.readLine(); 
			 while(data!=null) {
				 System.out.println(data);
			
				 st=new StringTokenizer(data,"#");
				 //System.out.println(st);
				 while(st.hasMoreElements()) {
	
					 String id_s=st.nextToken();
					 String name=st.nextToken();
					 String mo_No=st.nextToken();
					 int bal=Integer.parseInt(st.nextToken());
					 if(!(id.equals(id_s))) {
						 bal=bal;
						 
						// write_TempFile_AftrDe(id_s,name, mo_No,bal);	 	 		 
					 }
					 else if(id.equals(id_s)) {
						 int t_bal=bal+deposit;
						bal=t_bal;
						 write_deposit_File(deposit, id_s,String.valueOf(bal));
						System.out.println("My id"); 
						 
					 }
					 write_TempFile_AftrDe(id_s,name, mo_No,bal);
					// data=br.readLine();
					 }
				//end of inner while
				 data=br.readLine();
				 }//end of outer while
			 
			fr.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ForHome_Page.direct_HomePage();
	}
		
	public void write_deposit_File(int deposit,String id_s,String t_bal) {
		try {
		{
			FileWriter fw=new FileWriter("Deposit_Amount.txt",true);
			fw.write(id_s);
			fw.write("#");
			fw.write(String.valueOf(deposit));
			fw.write("#");
			fw.write(date1);
			fw.write("\n");
			fw.close();
		
		System.out.println("Your balance is "+t_bal);
		
		}
		
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void write_TempFile_AftrDe(String id_s,String name,String mob,int bal) {
	//FileWriter fw;
	try {
		FileWriter fw = new FileWriter("TempMaster.txt",true);
	   /* if(id.equals(id_s)) {
	    	bal=Integer.parseInt(d_bal);
	    }*/

		fw.write(id_s);
		fw.write("#");
		fw.write(name);
		fw.write("#");
		fw.write(mob);
		fw.write("#");
		fw.write(String.valueOf(bal));
		//fw.write("#");
		fw.write("\n");
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}

