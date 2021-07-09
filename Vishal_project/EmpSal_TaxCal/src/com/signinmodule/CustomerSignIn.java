package com.signinmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.homepage.ForHome_Page;
import com.utilityoffile.UtitlityForFileWrite;

public class CustomerSignIn {
	BufferedReader br;
	
	UtitlityForFileWrite ufw;
	Deposit_Module dm=new Deposit_Module();
	 
	public CustomerSignIn() {
		
	}
	
	
	public void get_BasicOperations(String id) {
		System.out.println("## BASIC OPERATIONS ##");
		System.out.println("1. Deposit"+"\n"+"2. Withdrawl"+"\n"+"3. Reports"+"\n"+"4. Home_Page");
	
	br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter you choice");
	try {
		int i=Integer.parseInt(br.readLine());
		
		getOperation(i,id);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public void getOperation(int s,String id){
		
		
		
		switch(s) {
		case 1:System.out.println("##Deposit module##");
		 System.out.println("Enter Amount to be deposit");
			//int dep_Amnt=0;
			try {
				int dep_Amnt = Integer.parseInt(br.readLine());
				dm.customerMoney_Deposition(id, dep_Amnt);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			break;
		case 2://Withdrawl
			break;
		case 3://Reports
			break;
		case 4:ForHome_Page.direct_HomePage();
			break;
		}
		
	}

}


