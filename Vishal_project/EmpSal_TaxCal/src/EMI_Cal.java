
public class EMI_Cal {
	//properties
	 double principal_Amount, interestRate_peranum, time_yr, emi_month;
	 
	 //default constructor
	 
	 EMI_Cal(){
	 }
	 
	 //Overloaded constructor
	 
	 EMI_Cal(double a,double b,double c){
		 principal_Amount=a;
		 interestRate_peranum=b;
		 time_yr=c;
		 	 
	 }
	 
	 void getEMI() {
		 
		
        
        //convert yrs into months
        
        time_yr=time_yr*12;     
      
        emi_month= (principal_Amount*(interestRate_peranum/100)*Math.pow(1+interestRate_peranum,time_yr))/(Math.pow(1+interestRate_peranum,time_yr)-1);
        
       System.out.println(" principal amount is :Rs. "+principal_Amount);
       
       System.out.println("intrest rate is : "+interestRate_peranum+" %");      

       System.out.println("time period is: "+time_yr +" months");
      
     
       System.out.println("Monthly EMI is= "+emi_month);
	 }

}
