package com.signup_module;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Account_No {
	FileWriter fw=null;
	BufferedReader br;
	FileReader fr;
	StringTokenizer st;
	static String prefix="SB";
	
	String id_t;
	
	public Account_No() {
		
	}
	
		public String print_AccntId() {		//method to print accnt no
			 try {
				 br=new BufferedReader(new InputStreamReader(System.in));
				fr=new FileReader("E:/accontNo.txt");
			
			 br=new BufferedReader(fr);
			
			 
				 id_t=br.readLine();
				 
				
				 fr.close();		
			 }
			 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 String id_temp=prefix+id_t;
				return id_temp;
				 
	}//end of printid method
		
		


 public void writefile_id() {
	 try {
		System.out.println("Your signup is successful");
		System.out.println("please note, your id is "+print_AccntId());
		
		int id=Integer.parseInt(id_t)+1;
		String id_s=String.valueOf(id);
		
		fw=new FileWriter("E:/accontNo.txt");
		fw.write(id_s);
		
	   fw.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	 
 }//end of write file id
}

