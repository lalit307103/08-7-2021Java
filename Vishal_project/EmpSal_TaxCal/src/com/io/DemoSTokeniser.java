//String tokenizer use to slice the data
package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer; 

public class DemoSTokeniser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;
		
		
		try {
			fr=new FileReader("E:/drivers/fileJava/StringTokeniser.txt");
			br=new BufferedReader(fr);
			String data=br.readLine();
			
			//until the end of file ,want to read the data and split every line into multiple string objects
			System.out.println("id \t name \t basicsal");
			while(data!=null) {
				st= new StringTokenizer(data,"#");  //here the # is tokenizer means it will break from the #
				//splits the given string object into multiple string objects
				while(st.hasMoreElements()) {
					String id=st.nextToken();
					String name=st.nextToken();
					String bsal=st.nextToken();
					System.out.println(id + "\t " +name+ "\t"+bsal);
					//String tSal=String.valueOf(calTsal(bsal));
				//	writeData(id,name,bsal,tSal);
					
				}
				data=br.readLine();
				// displaying the data, the above data can be use to process any BL
				 
		
			}//end of outermost while
			
		}
catch (Exception e){
	e.printStackTrace();
	
}
	 	
	}
	// method to calculate total salary 
	/*public static float calTsal(String s) {
		int i=Integer.parseInt(s);
		float hra=0.1f*i;
		float da=0.07f*i;
		float pf=0.05f*i;
		
		float tsal=((i+hra+da)-pf);
		return tsal; 
	}*/
	
	/*public static void writeData(String eid,String ename,String ebsal,String etsal) {
		FileWriter fw=null;
		try {
	
			fw=new FileWriter("StringTokeniser.txt");
			fw.write(eid);
			fw.write("#");
			fw.write(ename);
			fw.write("#");
			fw.write(ebsal);
			fw.write("#");
			fw.write(etsal);
			fw.write("\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}


