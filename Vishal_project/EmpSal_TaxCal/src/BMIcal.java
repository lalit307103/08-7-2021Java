
public class BMIcal {
	float height_cm=160,weight_kg=75;
	float bmi;
	

	
	//default constructor
	BMIcal(){
	}
	
	//overloaded constructor
	
	BMIcal (float a, float b ){
		
		
		height_cm=a;
		weight_kg=b;
	}
	
	
	void getBMI() {
		
		bmi = ((weight_kg/(height_cm*height_cm))*10000f);
		
		if(bmi>=18.5 && bmi<=25) {
		 System.out.println("your Body Mass Index is "+ bmi+" and you are healthy");
		}
		
		if(bmi>25) {
			System.out.println("your BMI is " +bmi+" you are overweight");
		}
		
		if(bmi<18) {
			System.out.println("you are Underweight");
		}
	}

}
