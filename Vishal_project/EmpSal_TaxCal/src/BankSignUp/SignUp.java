package BankSignUp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;

import BankSignIn.SignIn;

public class SignUp {
	BankSignIn.SignIn sIn = new BankSignIn.SignIn();

	public void intoHomepage() //Banking application Home page method Starting method
	{
		BufferedReader bRead;// use to read data from console
		bRead = new BufferedReader(new InputStreamReader(System.in));// read the data from console
		System.out.println("==========================");
		System.out.println("SBI Banking Application  [HOME PAGE]");
		System.out.println("==========================");
		System.out.println("1.SignUp ");
		System.out.println("2.SignIn");
		System.out.println("3.Exit");
		System.out.println("Please Enter Your Choice....[1-3]\n");
		System.out.println("==============================");
		 
		String i;//switch case input
		try {
			i = bRead.readLine();
			switch (i) {
			case "1":
				txnsignup();//goes for signup module
				break;

			case "2":
				sIn.signInEntryWithId();//goes for signIn module
				sIn.deleteMasterFile();
				
				break;

			case "3":
				System.out.println("Application Is Closed,.. Thanks for Using SBI Services !");
				System.out.println("-------------------------------------------------------");
				System.exit(0);

				break;
			default:
				System.out.println("Input is not Valid....try Again");
				chkForContinueEntry();
				break;

			}
		} // End try
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // End catch

	}

	public void txnsignup()// this method is signUp for new customer registration
	{
		FileWriter fWrite = null;// use to write data into the file
		BufferedReader bRead;// use to read data from console
		PrintStream pS;// use to display msg on console

		try {

			fWrite = new FileWriter("C:\\Users\\hp\\Desktop\\BankReport\\master.txt", true);// file is created if not
																							// existing
			// or overwritten if existing
			bRead = new BufferedReader(new InputStreamReader(System.in));// read the data from console
			pS = new PrintStream(System.out);// use like Sysout
			pS.println("==================");
			pS.println(" SignUp Module");
			pS.println("==================       Minimum Balance-1000rs");

			pS.println("Enter Customer Name");
			String custName = bRead.readLine();

			pS.println("Mobile Number");
			String custMobNo = bRead.readLine();

			pS.println("Enter Deposit Amount");
			String custDepoAmt = bRead.readLine();
			String str1 = String.valueOf((readCurrentAcc()));

			pS.println("SignUp is Successfully ..Your Account Number is:[ SBI" + (readCurrentAcc())
					+ " ] ,Plese Note it...");
			pS.println("==========================                        ******");
			// write data into the text file

			fWrite.write("SBI" + str1);
			insertNewAcc(str1);
			fWrite.write(" # ");

			fWrite.write(custName);
			fWrite.write(" # ");

			fWrite.write(custMobNo);
			fWrite.write(" # ");

			fWrite.write(custDepoAmt);
			fWrite.write("\n");
			insertDepositRecord(str1, custDepoAmt);//Automatically insert records into deposit table

		} // End Most Outer tryblock

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // End Catchblock

		// Now close the File in finally block

		finally {
			try {
				fWrite.close();
			} // close inner try of finally
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // End inner catch of finally
		} // End finally block

		chkForContinue();//if our task is compleat to go for HomePage
	}// End txnsignUp()

	public void insertDepositRecord(String acountNo, String txnAmt) // this method is used for
	{ // insert records into deposit table like a/c no and transaction amount

		FileWriter fwDepo = null;

		try {
			fwDepo = new FileWriter("C:\\Users\\hp\\Desktop\\BankReport\\deposit.txt", true);
			fwDepo.write("SBI" + acountNo);
			fwDepo.write(" # ");
			fwDepo.write(txnAmt);
			fwDepo.write("\n");
		} // close try
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // close catch
		finally {
			try {
				fwDepo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// close method insertDepositRecord(String acountNo,String txnAmt )

	public String readCurrentAcc() // this method is used for take starting 
	//account number where is to be declare in temp file
	{
		BufferedReader br;
		FileReader fr = null;
		String filePath_Name = "C:\\Users\\hp\\Desktop\\BankReport\\temp.txt";
		String data = null;

		try {

			fr = new FileReader(filePath_Name);
			// read data using BR object
			br = new BufferedReader(fr);
			data = br.readLine();

			// loop through the end of file
			// while(data !=null)
			// {
			// data = br.readLine();

			// }
			// lastCount=data;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("sorry,File Does not exist");
			e.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		}

		finally {

		}
		return data;
	}

	public void insertNewAcc(String acc) // override again accountNo in the Temporary table
	{

		FileWriter fw_acc = null;
		try {
			fw_acc = new FileWriter("C:\\Users\\hp\\Desktop\\BankReport\\temp.txt");

			int a = Integer.parseInt(acc);
			String b = String.valueOf((a + 1));

			String str1 = b;
			fw_acc.write(str1);
			fw_acc.write("\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw_acc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void chkForContinue() // continue for signup
	{
		BufferedReader br11;
		br11 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n");
		System.out.println("Do you want to go for HomePage [y/n]");
		System.out.println("--------------------------------------");

		String chk = null;
		try {
			chk = br11.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// check for the input and taking appropriate action
		if (chk.equalsIgnoreCase("y"))
			intoHomepage();
		else {
			System.out.println("now i am exiting the application");
			System.exit(0);
		}

	}

	public void chkForContinueEntry() // continue for starts corrects choices
	{
		BufferedReader br12;
		br12 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter Correct Choice....[1-3]");
		String chk = null;
		try {
			chk = br12.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// check for the input and taking appropriate action
		if (chk.equalsIgnoreCase("1"))
			txnsignup();
		else if (chk.equalsIgnoreCase("2"))

			sIn.signInEntryWithId();

		else {
			System.out.println("Again Your Choice is Wrong ..Now Application is closing");
			System.exit(0);
		}

	}

}// End SignUp
