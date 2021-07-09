package com.signup_module;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import com.homepage.ForHome_Page;


public class Sign_Up {	
	
	BufferedReader br;
	PrintStream ps;
	Account_No ac;
	ForHome_Page fhp;
	CreateMasterFile mastr;
	
	public String cust_Name;
	public String cust_Mo_no;
	public String depo_Amnt;
 
	
	
	
//Default constructor
	public Sign_Up() {
		
	}

//method to capture data
	public void capture_Cust_Info() {
		//Capture the data input by the user
		br=new BufferedReader(new InputStreamReader(System.in));
		ps=new PrintStream(System.out);
		ac=new Account_No();
		
		
		try {
		ps.println("Enter your Name");
		br.readLine();
		cust_Name=br.readLine();
		 
		ps.println("Enter Mobile No");
		
		cust_Mo_no=br.readLine();
		
		
		ps.println("Enter Deposit amount");
		ps.println("The deposit amount should be more than 1000 rs");
			
		depo_Amnt=br.readLine();
	
		mastr=new CreateMasterFile();  //create an object of mf
		mastr.writeMasterFile(ac.print_AccntId(),cust_Name,cust_Mo_no ,depo_Amnt);   //wrtiring the master file
		//invoke static method for homePg
		ac.writefile_id();		//give them info abt accnt id
		
		ForHome_Page.direct_HomePage();
		
		
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}		
}			//end of acpture cust info()
	
	
	
	
	
	
}

