package com.homepage;

import java.io.IOException;

import com.signinmodule.CustomerAunthantication;
import com.signup_module.Sign_Up;

public class Home_Page {
	
	public Home_Page(){
		//Default constructor	
	}
	Sign_Up su=new Sign_Up();
	CustomerAunthantication c_auth;
	
	
	
	public void callHomePage(){			//utility function for home page
		System.out.println("# Banking Application #");
		System.out.println("************************************************");
		System.out.println();
		System.out.println("1.  Sign-Up");
		System.out.println("2.  SignIn");
		System.out.println("3.  Exit");
		
		System.out.println("Please Select Your Choice (1-3)");
		
			
			int c=0;
			try {
				c = Integer.valueOf(System.in.read());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("value of c"+c);
			getModule(c);
	}
	//method to get module 
	public void getModule(int n) {
		int i=n;
		c_auth=new CustomerAunthantication();
		switch (i) {
		case '1':su.capture_Cust_Info();				
			break;
		case '2': c_auth.getSignIn();    //call the sign-in object here from the package and class
			break;
		case '3':System.out.println("I am exiting from application");
		        //exit the app
		break;
		
		}
	}

}
