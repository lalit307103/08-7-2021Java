package com.signinmodule;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;



public class ChkForString{
	BufferedReader br=null;
	FileReader fr=null;
	StringTokenizer st;
	boolean flag=false;
	
	public ChkForString(){
		}
	
	
	
	 public boolean getAuthentication(String id,String file_Path) {
		 try {
			 int temp=0;
		
			fr=new FileReader(file_Path);
		
		 br=new BufferedReader(fr);
			String data = br.readLine(); 
		 while(data!=null) {
		
			 st=new StringTokenizer(data,"#");
			 while(st.hasMoreElements()) {
				 String id_s=st.nextToken();
				 st.nextToken();
				 st.nextToken();
				 st.nextToken();
				 if(!(id.equals(id_s))) {
					 ++temp;
				 }
				 else {
					 flag=true;
					 return flag;
				 }
			 }//end of inner while
					data=br.readLine();	
			 }//end of outer while
			 if(temp>0) {
				 System.out.println("invalid id");
			 }
			 
		
		 }
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		/* try {
			//fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		 return flag;			
}
	 }
		
		
  

