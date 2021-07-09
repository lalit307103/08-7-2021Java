package BankSignIn;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
 import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.omg.CORBA.Current;
import org.omg.CORBA.NO_RESOURCES;
import org.omg.CORBA.PUBLIC_MEMBER;

 
public class SignIn {
    FileWriter fw;
    FileReader fr;
    PrintStream ps;
    BufferedReader br;
    BufferedReader brConsole;
    BufferedWriter bw;
	String getAccno;
   public SignIn() {
	  try {
		fr= new FileReader("C:\\users\\hp\\Desktop\\BankReport\\master.txt");
	
		 brConsole = new BufferedReader(new InputStreamReader(System.in));  
		   
		   br = new BufferedReader(fr);
	  } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	 
		
	}  
	

public void signInEntryWithId() { 
		
			String myuserId;
			try {
			    BufferedReader br5;
				br5= new BufferedReader(new InputStreamReader(System .in ));
			    System.out.println("Enter your account no...");
			    myuserId = br5.readLine();
				fetchValidId(myuserId);	 
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				
			}
			 
	}
public void fetchValidId(String entryUserId) {
	 	String line="";
		try {
			FileInputStream fIn = new FileInputStream("C:\\users\\hp\\Desktop\\BankReport\\master.txt");
			Scanner sc = new Scanner(fIn);
			while(sc.hasNextLine()) {
				line= sc.nextLine();
				 if(line.startsWith(entryUserId))
				{
					 
					  System.out.println("Your login is Successful...");
			    	  signInHome(entryUserId);
				}
				
			}
			// System.out.println("Invalid Account No...");
			  
				}	
		catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("Invalid Account No...");
			
		}
   finally {
	try {
		br.close();
		fr.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
	 
  }
public void signInHome(String getAccno) {
	BufferedReader br1= new BufferedReader(new InputStreamReader(System .in ));
	
	try {
	
		
		// TODO Auto-generated method stub
		System.out.println("=======================");
		System.out.println("SignIn Module");
		System.out.println("=======================");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Reports");
		System.out.println("4.Return To Home Page");
		System.out.println("=======================");
		
		String sIN = null;
	 	System.out.println("Enter your choice:...[1/4]");
			
	 	sIN = br1.readLine();
		
		 
		switch (sIN) {
		case "1":deposit(getAccno);
			// System.out.println("welcome to deposit module");
				
			break;

		case "2":
		//	withdraw();
			break; 

		case "3":
		        // reports();
		case "4":
			    // homepage();
			break;
		default:
			System.out.println("Input is not Valid....");
			System.exit(0);
			break;
}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		 
	
	} 	
public void deposit(String Userid)
{
	String id = null,name,phon_no = null,bsal;
	BufferedReader br = null;
	BufferedReader br1 = null;
	
	FileReader fr = null;
	br1 = new BufferedReader(new InputStreamReader(System.in));
	
	try {
		String filePath_Name="C:\\Users\\hp\\Desktop\\BankReport\\master.txt";
		
		fr = new FileReader(filePath_Name);
		//read data using BR object
		br= new BufferedReader(fr);
		String data=br.readLine();
		
		
		
	   System.out.println("Enter Deposit salary");
		String userSal=br1.readLine();
		
		 	while(data !=null)
		{
			 StringTokenizer st = new StringTokenizer(data,"#");
				
			while (st.hasMoreElements())
			 	 {     
					   id     = st.nextToken();		
				      name    = st.nextToken();
				      phon_no   = st.nextToken();
				      bsal      = st.nextToken();
					 
						if(id.equals(Userid))
						{
				 		 int a=   Integer.parseInt(userSal);
						 int b=   Integer.parseInt(bsal);
							   	
							String totalSal =String.valueOf(a+b);
							
							insertIntoTempoFile(id,name,phon_no,totalSal);
				       }
						else
						{
							insertIntoTempoFile(id,name,phon_no,bsal);
						     
						}
						data= br.readLine();
			 	 		} 
		}
	}
	 catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("sorry ,Invalid file name");
		e.printStackTrace();
	}
	catch(IOException io)
	{
		io.printStackTrace();
	}
finally {
	try {
		br.close();
		//fr.close();
		br1.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
}
public void insertIntoTempoFile(String uID,String uName,String mobNo,String depoAmt)
{	File f11= new File("C:\\Users\\hp\\Desktop\\BankReport\\temporary1.txt");
  FileWriter fwTemp = null;
  try {
	fwTemp = new FileWriter(f11,true);
	    
     fwTemp.write(uID);  
     fwTemp.write("#");
     fwTemp.write(uName);  
     fwTemp.write("#");
     fwTemp.write(mobNo);  
     fwTemp.write("#");
     fwTemp.write(depoAmt);  
     fwTemp.write("\n");
  } catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

finally {
	try {
		fwTemp.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	 		
}	
 
 
	 	 
	 			 
}
public void deleteMasterFile() {
	File f2= new File("C:\\Users\\hp\\Desktop\\BankReport\\master.txt");
	File f3= new File("C:\\Users\\hp\\Desktop\\BankReport\\temporary1.txt");

	 f2.delete();
	 f3.renameTo(f2);
	 
	
}
}

