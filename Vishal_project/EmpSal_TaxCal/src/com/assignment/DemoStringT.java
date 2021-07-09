package com.assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class DemoStringT {
	FileReader fr;
	BufferedReader br;
	StringTokenizer st;
	FileWriter fw;
	int all=0;
	
	
	
	public DemoStringT(){
		
		
	}
	
	public void getdata() {
		try {
			fr=new FileReader("E:/drivers/fileJava/StringTokeniser.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		br=new BufferedReader(fr);
	   String data=null;
		
			
				try {
					data = br.readLine();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
		
		//until the end of file ,want to read the data and split every line into multiple string objects
		System.out.println("id\tname\tbsal\tTsal");
		while(data!=null) {
			st= new StringTokenizer(data,"#");  //here the # is tokenizer means it will break from the #
			//splits the given string object into multiple string objects
			while(st.hasMoreElements()) {
				String id=st.nextToken();
				String name=st.nextToken();
				String bsal=st.nextToken();
			
				
				// displaying the data, the above data can be use to process any BL
				String tsa=String.valueOf(calTsal(bsal));
				System.out.println(id + "\t " +name+ "\t"+bsal+"\t"+tsa);
				
				writeData(id, name, bsal, tsa);
				
				//int all=allEmpSal(Float.parseFloat(tsa));
			
				all = all+(calTsal(bsal));
					
			}
			try {
			
				
				data=br.readLine();
			} catch (IOException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}//end of outermost while
		
		System.out.println("The total Salary of all employees is "+all);

	}
	// method to calculate total salary 
		public int calTsal(String s) {
			int i=Integer.parseInt(s);
			float hra=0.1f*i;
			float da=0.07f*i;
			float pf=0.05f*i;
			
			int tsal=(int)((i+hra+da)-pf);
			
			return tsal; 
		}
		
		//method to calculate gross salary
		/*public int allEmpSal(float t) {
			int j=0;
			j+=t;
		
			return j;
			
		}*/
	public void writeData(String eid,String ename,String ebsal,String etsal) {
		
		try {
			//Write the file to add column
			
			fw=new FileWriter("StringTokeniser.txt",true);	
			
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





