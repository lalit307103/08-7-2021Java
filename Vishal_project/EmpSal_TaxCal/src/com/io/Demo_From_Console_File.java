package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Demo_From_Console_File {
	public static void main(String args[]) {
		FileWriter fw = null;// used to write data into a text file
		PrintStream ps;// used to display message on the console
		BufferedReader br;// used to read data from console
		// Demo_From_Console_File(){ }

		try {
			fw = new FileWriter("employeedata.txt", true); // file is created if not existing or overwritten if existing
			br = new BufferedReader(new InputStreamReader(System.in));// read data from the console
			// following display messages are used to enter data
			ps = new PrintStream(System.out);// used like sop
			ps.println("enter employee id");
			String empId = br.readLine();

			ps.println("enter employee name");
			String empName = br.readLine();

			ps.println("enter employee basic sal");
			String empBsal = br.readLine();

			// write data into a text file

			fw.write(empId);
			fw.write("#");
			fw.write(empName);
			fw.write("#");
			fw.write(empBsal);
			fw.write("\n");

		} catch (IOException e) {
			e.printStackTrace();
		}

		// close the file in the finally block

		finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}