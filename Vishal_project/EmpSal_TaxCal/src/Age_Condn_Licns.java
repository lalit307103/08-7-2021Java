

		public class Age_Condn_Licns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplyFor_License ap=new ApplyFor_License(78);
		ApplyFor_License ap1=new ApplyFor_License(20);
	
	
				try {
					ap.applyForLicense();
				} 
				catch (UnderAgeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (OverAgeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					ap1.applyForLicense();
				} catch (UnderAgeException | OverAgeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
	}

		}

		
	
/*class AgeException extends Exception{
	int age;
	public AgeException(int age) {
		this.age=age; 
	}
	
}*/



class UnderAgeException extends Exception{
	int age;
	
	public UnderAgeException(int age){
		this.age=age;
		System.out.println("Under Age Exception");
	}
	
}
class OverAgeException extends Exception{
	int age;
	
	public OverAgeException(int age){
		this.age=age;
		System.out.println("Over Age Exception");
	}
	
}


class ApplyFor_License{
	
	int age;
	ApplyFor_License(int age){
		this.age=age;
	}
		
		void applyForLicense() throws UnderAgeException,OverAgeException{
			if(age<18) {
				throw new UnderAgeException(age);
			}
			else if(age>65)  {
				throw new OverAgeException(age);
			}
			else {
				System.out.println("Eligible to get license");
			}
				
			}
			
		}
	



	