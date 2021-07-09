 //Read data from atext file
package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BufferedReader br;
FileReader fr;
String filePath_Name="D:\\Lalit\\demo.txt";//"D:/Lalit/demo.txt" linux and window same
try {
	int lineCount=1;
	fr = new FileReader(filePath_Name);
	//read data using BR object
	br= new BufferedReader(fr);
	//reading the first line of data
	String data=br.readLine();
	 
	//loop through the end of file
	while(data !=null)
	{
		//int lineCount = 1;
		System.out.println("data at line no is"+lineCount +""+data);
		//reading the following line or reinitializing 
		data = br.readLine();
		//inc the line count
		++lineCount;
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	System.out.println("sorry ,Invalid file name");
	e.printStackTrace();
}
catch(IOException io)
{
	io.printStackTrace();
}

	}

}
