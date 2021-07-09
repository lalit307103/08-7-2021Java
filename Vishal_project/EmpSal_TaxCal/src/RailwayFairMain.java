
public class RailwayFairMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   RailwayDynDisp ref; 
	 // abstract  class referance creation bcoz object cannot be created for abstract class
    //  System.out.println(ref.dispPsgDetails());
     

     ref = new SuperFastPsg("sagar","Dhule",350);//that the syntax for referencing the abstract class to child class means
    //reference variable of superclass (abstract)pointing to child class object is known as dynamic method dispatch.
     ref.dispPsgDetails();
     System.out.println("*Superfast* Train fair is   "+ref.calPsgFair());
     System.out.println("\n");
    
     ref = new LocalPsg("bhushan","Dhule",350);
     ref.dispPsgDetails();
     System.out.println("*local* Train fair is   "+ref.calPsgFair());
     
     
     /*ref = new LocalPsg("Bhushan","Dhule",350);
     ref.dispPsgDetails();
     System.out.println("*Local* Train fair is  "+ref.calPsgFair());
	*/	
	}

}
