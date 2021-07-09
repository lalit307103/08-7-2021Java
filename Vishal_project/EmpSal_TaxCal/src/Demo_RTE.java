//Demo for run time exceptions or unchecked exceptions

public class Demo_RTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = args.length; // to determine the length of command line args
		
		
		try {
			int num = 10 / length;// dividing 10 with the length of CLA---can create ArithmaticException object,if
									// length is 0
			System.out.println("Value of num is" + num);
		} 
		catch (ArithmeticException ae) {
			System.out.println("Error");
			ae.getStackTrace();
		}
		
		
		try {
			int no = Integer.parseInt("abcd");// improper conversion of A String object
			System.out.println("no is" + no);
		} catch (NumberFormatException nfe){
			nfe.getStackTrace();
		}
		
		
		try {
			  System.out.println("command line argument" + args[0] + "" + args[1]);
		    } catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("invalid length of CLA/cammand line argument");
		}
		
		
		
		try {
			Demo_for_NullPoinExc ref = new Demo_for_NullPoinExc();
			ref.dispSomeVal();// will generate NullPointerException
		} catch (NullPointerException npe) {
			System.out.println("create an object");
		} 
		finally {
			System.out.println("Welcome to finally ");
			System.out.println("Hello,i am existing now");
			
			String s = "java";
			char c = s.charAt(1);//at location 0=j,1=a,2=v,3=a
			
			System.out.println("Character at index 1 is" + c);//mn because that store only single character i.e we use char 

			System.out.println("java".charAt(2));//thats assign 2 nd location of string

		}

	}// end of main method
}// end of class block

class Demo_for_NullPoinExc {

	int temp;

	Demo_for_NullPoinExc() {
		temp = 100;//Default constructor
	}

	void dispSomeVal() {
		System.out.println("new temp value is" + temp);
	}
}
