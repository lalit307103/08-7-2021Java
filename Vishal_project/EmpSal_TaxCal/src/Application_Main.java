import java.io.IOException;

public class Application_Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Application_Presentation ap=new Application_Presentation();
		
		
		 //Object ob=new Object();
		
		DataTypes dt=new DataTypes();
		
		//int j=1;
		boolean flag=true;

		while(flag)
		
		 {
			ap.getPresentation();
			System.out.println("Enter any no. from above ");
		
		int i=System.in.read();
		//System.out.println((char)i);
		
		
	

		switch(i) {
		
		case '1':dt.getData();
		break;
		
		//case '2':;
		//break;
		
		case'3': System.exit(0);
		break;
	
		
		default:System.out.println("Please enter valid no.");
		
		
		}
		System.out.println("Do you want to continue Y/N"); 
        char x=(char)System.in.read();
        char ch = 'y';
		
		if(x==ch) {
			System.out.println("entered y");
		
			flag=true;
		}
		
	
		else 
			flag=false;
		
		
		

		 }//end of while loop
		}
	}
