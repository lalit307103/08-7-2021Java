 

 package com.assignment;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class File_Record {
	FileWriter fw=null;
	//private String empBsal=null;
	File_Record(){
		
		try {
			fw=new FileWriter("employeeData.txt",true) ;   // complete the process of creating fw
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  
	}
	
	
	// this method used to cspture data from the console
	void getDataCap()  {
		BufferedReader br;
		PrintStream ps;

		br=new BufferedReader(new InputStreamReader(System.in));
		ps=new PrintStream(System.out);
		
		try {
			ps.println("enter Employee id");
		    String empId;
			empId = br.readLine();
			ps.println("Enter employee name");
			 String empName=br.readLine();
			
			ps.println("Enter employee basic salary");
			String empBsal=br.readLine();
			
			String tsal=String.valueOf(getTsalofEmp(empBsal));
			ps.println("Total salry is "+tsal);
			
			
			// now , captured data is written onto a text file
			getWriteData(empId,empName,empBsal,tsal);
			chkForContinue();
			
			

		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
		
	
	
	void getWriteData(String id,String name,String sal,String ts) {
		
		try {
			
	
			fw.write(id);
			fw.write("#");  //for separation of words
			fw.write(name);
			fw.write("#");
			fw.write(sal);
			fw.write("#");
			fw.write(ts);
			fw.write("\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //file is created if not existing or overwritten if exist
		
			} 
	//find the total salary of employee
	int getTsalofEmp(String s) {
		
		int temp=Integer.parseInt(s);
		float hra= 0.10f*temp;
		float ha=0.05f*temp;
		float pf=0.03f*temp;
		
		int tsal=(int) ((temp+hra+ha)-pf);
		
		return tsal;
		
			
	}
	
	  
	
	
	// end of method
	// used to continue until the user says 'NO'
	
	
	void chkForContinue() {
		BufferedReader br1;
		
		br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("do u want to continue (Y/N");
		try {
		String chk=	br1.readLine();
		// checking for the input and taking appropriate action
		if(chk.equalsIgnoreCase("y"))
			getDataCap();
		else
		{
			System.out.println("now, i am exiting the application");
			//System.exit(0);
			
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

finally {
	try {
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
		}
		
		
		
	}

}
