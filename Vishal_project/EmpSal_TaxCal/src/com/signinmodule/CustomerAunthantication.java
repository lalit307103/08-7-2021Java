package com.signinmodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;



public class CustomerAunthantication {
	//check for id is exist in signup file

	PrintStream ps;
	Scanner sc1;
	BufferedReader br;
	String id=null;
	ChkForString chk_id;
	CustomerSignIn csi;
	
	
	public CustomerAunthantication(){
		
	}
	 
	
	public void getSignIn() {
			
		ps=new PrintStream(System.out);
		br=new BufferedReader(new InputStreamReader(System.in));
		chk_id=new ChkForString();
		
		try {
		
			ps.println("please enter your pin with prefix");
			br.readLine();
			String id= br.readLine();
			ps.println(id);
			
				if(chk_id.getAuthentication(id, "E:/MasterFile.txt")) {
					ps.println("exist");
					 
					csi=new CustomerSignIn();
					csi.get_BasicOperations(id);
				}
				
				//System.out.println(id+"this is my id");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
				 
		
			
		}
		
	}


