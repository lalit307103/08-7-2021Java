package vendor_id_genrate;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

 
public class GengerateID {
	public String readCurrentId() // this method is used for take starting 
	//account number where is to be declare in temp file
	{
		BufferedReader br;
		FileReader fr = null;
		String filePath_Name = "vendor.txt";
		String data = null;

		try {

			fr = new FileReader(filePath_Name);
			// read data using BR object
			br = new BufferedReader(fr);
			data = br.readLine();
 		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("sorry,File Does not exist");
			e.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 return data;
	}		
public int a= Integer.parseInt(readCurrentId());

	
	 
	
	public void get_Id_Increament() {
		FileWriter fw = null;
		try {
			fw=new FileWriter("vendor.txt");
	     	fw.write(String.valueOf(a+1));
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

		
		
 

