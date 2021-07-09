
public class NGO_Donation {

	String donar_Name;
	int donar_contry;
	static int balance=10000;
	
	public NGO_Donation() {
	super();
}
public NGO_Donation(String donar_Name,int donar_contry) {
	super();
	this.donar_Name = donar_Name;
	this.donar_contry= donar_contry;
	balance = balance+donar_contry;
  
}
public void dispNgoBalance()
{
	System.out.println(""+donar_Name+"   contrubutions "+donar_contry);
	System.out.println("the NGO total balance is "+balance);	 
}
 
}


 
