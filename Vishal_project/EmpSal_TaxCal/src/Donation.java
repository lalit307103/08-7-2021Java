
public class Donation {

	int donate_Amnt;
	static float balance=10000;
	String name;
	public Donation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donation(int donation, String name) {
		super();
		donate_Amnt = donation;
		this.name = name;
	    balance=balance+donation;
	}
	
	float getbalance(){
		
		System.out.println("current is balance"+balance);
		return balance;
	}
	
	
}
