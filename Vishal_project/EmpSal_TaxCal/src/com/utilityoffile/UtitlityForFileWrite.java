package com.utilityoffile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.signinmodule.CustomerAunthantication;
import com.signup_module.Account_No;

public class UtitlityForFileWrite{
	BufferedReader br;
	BufferedReader br1;
	StringTokenizer st;
	CustomerAunthantication ca;
	FileReader fr;
	Account_No ac;
	boolean flag=false;
	
	public UtitlityForFileWrite(){
		
	}
	
	 
	public boolean depositinAccnt(int depoAmnt,String date,String id){
		try {
			ac=new Account_No();
			br1=new BufferedReader(new InputStreamReader(System.in));
		ca=new CustomerAunthantication();
		fr=new FileReader("E:/MasterFile.txt");
		br=new BufferedReader(fr);
		int temp=0;
		
		//String data=null;
		
			String data = br.readLine();
		
		//loop thru the end of file
		while(data != null) {
		st=new StringTokenizer(data, "#");
		while(st.hasMoreElements()) {
			String id_t=st.nextToken();
			String name=st.nextToken();
			String mno=st.nextToken();
			String bal=st.nextToken();
			if(!(id.equalsIgnoreCase(id_t))){
				++temp;	
				
			}
			else {
				int tbal=Integer.parseInt(bal)+depoAmnt;
				System.out.println(bal);
				System.out.println(tbal);
				flag=true;
				return flag;
				
			}
				
		}
		data=br.readLine();
	//	System.out.println("inner");
		//System.out.println(bal);
			
		}

		//System.out.println("outr");
	if(temp>0) {
	System.out.println(ac.print_AccntId());
	System.out.println("invalid");
		 
			
		}
		fr.close();	
		
	}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	
	
}
