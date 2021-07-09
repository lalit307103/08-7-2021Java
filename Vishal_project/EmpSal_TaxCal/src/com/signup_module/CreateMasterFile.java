package com.signup_module;

import java.io.FileWriter;
import java.io.IOException;

public class CreateMasterFile{
	FileWriter fw;
	
	public CreateMasterFile() {
		
	}
	public void writeMasterFile(String id,String name,String moNo,String dep ) {
		
		try {
			fw=new FileWriter("E:/MasterFile.txt",true);
			
			fw.write(id);
			fw.write("#");
			fw.write(name);
			fw.write("#");  //for separation of words
			fw.write(moNo);;
			fw.write("#");
			fw.write(dep);
			fw.write("#");
			fw.write("\n");
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
