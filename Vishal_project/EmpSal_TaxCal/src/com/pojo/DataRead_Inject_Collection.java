package com.pojo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DataRead_Inject_Collection {
	FileReader fr=null;
	StringTokenizer st;
	BufferedReader br;
	List<EmployeeData> li;
	EmployeeData ed;
	public DataRead_Inject_Collection(){
		li=new ArrayList<EmployeeData>();
		
	}
	//method to read,split,inject,add pojo to collection and return a collection of pojo's
	
	List<EmployeeData> readData_Inj_POJO() {
		try {
		fr=new FileReader("empData.txt");
		br=new BufferedReader(fr);
		String data=br.readLine();
		while(data!=null) {
			st=new StringTokenizer(data, "#");
			while(st.hasMoreElements()) {
				String id=st.nextToken();
				String name=st.nextToken();
				String bsal=st.nextToken();
				
				//injecting the above values into the POJO
				ed=new EmployeeData();  //PojO created
				
				//Setting the values
				ed.setEmpid(Integer.parseInt(id));
				ed.setEmpName(name);
				ed.setEmp_bsal(Float.parseFloat(bsal));
				
				//adding the POJO to the collection
				li.add(ed);
			}//eo inner while
			data=br.readLine();
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return li; //returning the cillection of POJO
	
	}

}


