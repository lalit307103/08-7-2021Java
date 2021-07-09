
public class Gndr_AgeExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplyForDL ap=new ApplyForDL("Fema",67);
		try {
			ap.getDL();
		} catch (GendreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AgException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}



class GendreException extends Exception{
	String gend;
	GendreException(String gend){
		this.gend=gend;
	}
	
}


class AgException extends Exception{
	int age;
	AgException(int age){
		this.age=age;
	}
	
}

class ApplyForDL{
	
	//checking criteria 
	String gend;
	int age;
	
	ApplyForDL(String gend,int age){
		this.gend=gend;
		this.age=age;
		
	}
	void getDL() throws GendreException,AgException{
		if ( gend=="Male") 
			{
				if(age<18||age>70) {
					throw new AgException(age);
				}
				else {
					System.out.println("Eligible for license");
					
				}
	
			}
		else if(gend=="Female") {
			if(age<17||age>60) {
			throw new AgException(age);
		}
		
		else {
			System.out.println("Eligible for license");
			
		}
			}
			
		else {
			throw new GendreException(gend);
		}
	}
}
