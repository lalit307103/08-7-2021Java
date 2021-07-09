package com.io;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Demo_New_Console_File {

	//public static void main(String[] args) {
 		// TODO Auto-generated method stub
	FileWriter fw = null;// used to write data into a text file
	PrintStream ps;// used to display message on the console
	BufferedReader br;// used to read data from console
   //  Demo_From_Console_File(){ }

	void getData() {
		
		try {
			fw = new FileWriter("employeedata.txt",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // file is created if not existing or overwritten if existing
		br = new BufferedReader(new InputStreamReader(System.in));// read data from the console
			// following display messages are used to enter data
		ps = new PrintStream(System.out);// used like sop
		ps.println("enter employee id");
		String empId;
		try {
			empId = br.readLine();
			ps.println("enter employee name");
			String empName = br.readLine();

			ps.println("enter employee basic sal");
			String empBsal = br.readLine();
			writeData(empId,empName,empBsal);
		    chkForContinue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		// write data into a text file
    void writeData(String empId,String empName,String empBsal) {
	
 		try {
			fw.write(empId);
			fw.write("#");
			fw.write(empName);
			fw.write("#");
			fw.write(empBsal);
			fw.write("\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 
	// close the file in the finally block
   finally {
	   try {
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
	 
}

//end of the method
void chkForContinue() {
	BufferedReader br1;
	br1=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("do you want to continue [y/n]");
	String chk = null;
	try {
		chk = br1.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// check for the input and taking appropriate action
	if(chk.equalsIgnoreCase("y")) 
		getData();
	else
	{
		System.out.println("now i am exiting the application");
		System.exit(0);
	}
	
	
}
}

		 