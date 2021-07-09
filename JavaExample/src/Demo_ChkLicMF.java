
public class Demo_ChkLicMF{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try {
		 ApplyLicenseaAll a = new ApplyLicenseaAll(50,"f");
			a.applyForLicense();
		} 
   catch (LicAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			catch(GenderException e ) {				
			System.out.println("Please enter f/m");
			e.printStackTrace();
			}
	}
}

class LicAgeException extends Exception {
	int age;//

	public LicAgeException(int age) {
		super();
		this.age = age;
	}

}

class GenderException extends Exception {
	String gender;//

	public GenderException(String gender) {
		super();
		this.gender = gender;
	}

}

 

class ApplyLicenseaAll {
	// can take some properties
	int age;// one of the properties
	String gender;

		public ApplyLicenseaAll(int age, String gender)  {
		super(); 
		this.age = age;
		 
		this.gender = gender;
		
		
	}



	void applyForLicense() throws LicAgeException, GenderException {
		if (gender=="m")			
		{
			if (age>=18 && 65>=age)  // checking the candidate's age
			{
				
				System.out.println("You are applicable");
			}
			else
			{
				throw new LicAgeException(age);
			    
			}
			// throw new AgeException(age);//an Exception object is created for class
			// AgeException
			 
			//LicAgeException a = new LicAgeException(age);

		}
		 
		
		else if(gender=="f") 
		
		{
		     if(age>=16 && age<=50)
		     {
		    	 System.out.println("You are applicable");
		     }
		     else
		     {
		    	 throw new LicAgeException(age);
		     }
			
		}
		else
		{
			throw new GenderException(gender);
			
		}
	}
}

