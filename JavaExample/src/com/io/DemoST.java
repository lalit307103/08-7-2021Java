 
//string tokenizer
package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class DemoST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;

		try {
			fr = new FileReader("employeedata.txt");
			br = new BufferedReader(fr);
			String data = br.readLine();

			// untill the enf, want to read the data and Split every line into multiple
			// string objects
			//System.out.println("id \t name \t basic sal");
			while (data != null) {

				st = new StringTokenizer(data,"#");
				// split the given string object into multiple string objects

				while (st.hasMoreElements()) {
					String id   = st.nextToken();
					String name = st.nextToken();
					String bsal = st.nextToken();
					// displaying the data,the above data can be used to process any BL

					System.out.println(id +"\t"+name +"\t" +bsal);
				}
				 data = br.readLine();
			}// end of outer most while
		} 
		catch (Exception e) {
			e.printStackTrace();
		}//catch close

	}//public static main() method

 }//exit class

