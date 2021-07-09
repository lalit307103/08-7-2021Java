//Fundamental definitions for oops	
public class Fundamentle {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter any No\r\n");
		System.out.println("1.Data Types");
		System.out.println("2.Class");
		System.out.println("3.Constructor");
		System.out.println("4.Method Declaration");
		System.out.println("5.Exit");
		int i = System.in.read(); // it reads cmdline input from user
		Data_Types dt = new Data_Types();// datatypes
		ClassDefination cd = new ClassDefination();// class
		ConstructorDefination cnstr = new ConstructorDefination();// constructor
		boolean flag = true;
		/*while (flag)*/ 
			//System.out.println("you are in flag");

			switch (i) {
			case '1':
				System.out.println("" + dt.datatypeDefinition());// call datatypes methods

				break;
			case '2':
				System.out.println("" + cd.classDefinition());
				break;
			case '3':
				System.out.println("" + cnstr.constructorDefinition());
				break;
			case '4':
				System.out.println("METHOD DECLARATION");
				break;
			default:
				System.out.println("Please Enter Valid No.");

				//break;
			
			}
		
		System.out.println("Do you want to continue[y/n]");
		int y = System.in.read();
		if('y'==y)
		{
			flag = true;
		}
			else
			{
			System.exit(0);
			}
		
		//	}
		//boolean flag1 = true;
			
			if ('y'==y)
			{
				System.out.println("enter any no");
				int j=System.in.read();
				//boolean flag1 = true;*/
			      while (flag) {
					//System.out.println("you are in flag");

					switch (j) 
					{
					case '1':
						System.out.println("" + dt.datatypeDefinition());// call datatypes methods

						break;
					case '2':
						System.out.println("" + cd.classDefinition());
						break;
					case '3':
						System.out.println("" + cnstr.constructorDefinition());
						break;
					case '4':
						System.out.println("METHOD DECLARATION");
						break;
					default:
						System.out.println("Please Enter Valid No.");

					}
					}
					
				}
			
			}
			
		}
	

			
	 
					


	
	             
		
		
		
 