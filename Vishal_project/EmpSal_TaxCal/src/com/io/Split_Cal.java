 package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.StringTokenizer;

//import com.demo.skillmain.Temp;

public class Split_Cal {
    void	splitDataRead() {
		// TODO Auto-generated method stub
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;
		int total_sal = 0;
		 try {
			fr = new FileReader("D:\\Lalit\\tokenShow.txt");
			br = new BufferedReader(fr);
			String data = br.readLine();
			// untill the enf, want to read the data and Split every line into multiple
			// string objects
			// System.out.println("id \t name \t basic sal");
			while (data != null) {
				st = new StringTokenizer(data,"#");
				// split the given string object into multiple string objects
				while (st.hasMoreElements()) {
					String id   = st.nextToken();
					String name = st.nextToken();
					String bsal = st.nextToken();
					// displaying the data,the above data can be used to process any BL
					//System.out.println(id + "\t" +name + "\t" +bsal);
				    data = br.readLine();
 			    	total_sal = total_sal +Integer.valueOf( cal_Salary(id, bsal)) ;
			    
				}//Inner while close
			}//outer while close
			System.out.println("the total salary of employee" + total_sal);
		}//close try
		 
		catch (Exception e) {
			e.printStackTrace();
		}//end catch
	}//End SplitDataRead method()
    
    int 	cal_Salary(String id1,String bsal1)
    {
    	    int myid=Integer.parseInt(id1);
			int empSalary = Integer.parseInt(bsal1);
			int hra =(int) (0.12f * empSalary);// calculate HRA
			int da =(int) (0.73f * empSalary);// Calculate DA
			int gs =(int) (empSalary + da + hra);// calculate GROSS SALARY
			System.out.println("the employe id   " + id1 + "   there gross salary is  " + gs);
			return gs;
    }//end int cal_salary method
	 		
	}//end most outer class
    	
    	 