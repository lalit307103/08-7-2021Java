
public class Demo_Chk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplyLicense a1 = new ApplyLicense(55);
		try {
			a1.applyForLicense();
			System.out.println(" candidate is applyied for licences age" +a1.age);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("sorry as the candidate is only " + e.age);
		} // checked exception - compiler forces for try /catch or throws

	}

}

class AgeException extends Exception {
	int age;//

	public AgeException(int age) {
		super();
		this.age = age;
	}

} 

class ApplyLicense {
	// can take some properties
	int age;// one of the properties

	ApplyLicense(int age) {
		this.age = age;
	}

	void applyForLicense() throws AgeException {
		if (age < 18||65< age) // checking the candidate's age
		{
			// throw new AgeException(age);//an Exception object is created for class
			// AgeException
			AgeException a = new AgeException(age);
			throw a;

		}

	}
}