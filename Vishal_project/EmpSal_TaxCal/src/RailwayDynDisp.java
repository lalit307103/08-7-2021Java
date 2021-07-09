
public abstract class RailwayDynDisp {
	//float psg_km;
	String psg_Name,psg_destination;
	int psg_distance;
	
	final float ratePerKm_Super  =6;
	final float ratePerKm_Local  =3;
	
	public RailwayDynDisp() {//default constructor
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RailwayDynDisp( String psg_Name, String psg_destination,int psg_distance ) {//superclass overloaded constructor
		super();
		this.psg_Name = psg_Name;
		this.psg_destination = psg_destination;
		this.psg_distance = psg_distance;
	}

	void dispPsgDetails()
	{
	System.out.println(""+psg_Name+" is going to  " +psg_destination+" His Distance is  " +psg_distance+"Km");
	}
	 
  
	abstract float  calPsgFair();//an abstract class should mandatory have an abstract method 
	//abstract method has no body


}

class SuperFastPsg extends RailwayDynDisp{
 
	
	
	public SuperFastPsg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SuperFastPsg(String psg_Name, String psg_destination, int psg_distance) {
		super(psg_Name, psg_destination, psg_distance);
		// TODO Auto-generated constructor stub
	}

	float calPsgFair()//it is left to the child class to override the abstract method thus enabling the runtime polymorphism
	{
		float cal_SuperFair;
		
		cal_SuperFair= psg_distance * ratePerKm_Super ;
		
		return cal_SuperFair;
		
	}
	
}

class LocalPsg extends RailwayDynDisp {

	 
	
	public LocalPsg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalPsg(String psg_Name, String psg_destination, int psg_distance) {
		super(psg_Name, psg_destination, psg_distance);
		// TODO Auto-generated constructor stub
	}

	float calPsgFair()///it is left to the child class to override the abstract method thus enabling the runtime polymorphism
	{
		float cal_LocalFair;
		
		cal_LocalFair = psg_distance*ratePerKm_Local;
		
		return cal_LocalFair;
	}
	
}
  