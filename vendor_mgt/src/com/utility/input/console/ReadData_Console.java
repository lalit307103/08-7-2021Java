// class used to read data from console
package com.utility.input.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData_Console {
	//properties
	BufferedReader br;
	
public ReadData_Console() {
	
	br = new BufferedReader(new InputStreamReader(System.in));
}

public String getDataFromConsole() {
	String data=null;
	try {
		
		data= br.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;
}


}
