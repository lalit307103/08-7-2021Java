package com.utilityoffile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class UtiOfRead {
	
	BufferedReader br;
	FileReader fr;
	String filePath_Name; 
	int linecount=1; 
	
	//create a constructor for file input as data
	public UtiOfRead(String filePath_Name) {
		super();
		this.filePath_Name = filePath_Name;
	}
	//create a method to use it for utility
	
		public void getFileRead() {  //try to return a string array dont use sp in the method store it in array and return that array
	try { 
		fr=new FileReader(filePath_Name);
		
		//read data using BR Object
		
		br=new BufferedReader(fr);
		
		//Reading the first line ,It just read the first line of file
	
		
		String data=br.readLine();
		//loop thru the end of file
		while(data != null) {
			//int linecount=1;
			
			//System.out.println("data at line no "+linecount+" "+data);//
			
			//reading the following line or reinitializing
			data=br .readLine();
			//inc line count
			++linecount;
			
			
		}
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Sorry invalid file name");
		e.printStackTrace();
	}
	catch(IOException io) {
		io.printStackTrace();
	}
}
	
}
