//try catch using banking Application

public class CkedBankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Transaction txn = new Transaction();
try {
	txn.depositMoney(0);
	
} catch (DepositException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	txn.withdraMoney(1);
} catch (WithdrawException e) {
	// TODO Auto-generated catch block
	 
	e.printStackTrace();
}
	}

}


class DepositException extends Exception {
	int deposit_money;

	public DepositException(int deposit_money) {
		super();
		this.deposit_money = deposit_money;
	}
}


class WithdrawException extends Exception{
	
	int withdra_money;

	public WithdrawException(int withdra_money) {
		super();
		this.withdra_money = withdra_money;
	}
	
}



class Transaction
{
	 
 	float balance=100;
	
	  
	public Transaction() { 
	super();
	// TODO Auto-generated constructor stub
	 
}

	void depositMoney(int deposit_money) throws DepositException
	{   
		    
	
		if(deposit_money>=1) {
		 balance=deposit_money +balance;
	     System.out.println("Money Deposited "+deposit_money+"  Successfully..Now Your Available Balance is "+balance);	
		 		}
	
	else if(deposit_money<0)
	 System.out.println("Invalid Input ");
	}
	void withdraMoney(int withdra_money) throws WithdrawException
	{
		
		if(withdra_money>=1)
		{
	  if(balance >=withdra_money)
		{
		System.out.println("your Privious balance is  " +balance);
		balance= balance-withdra_money;
		System.out.println("Now You withdrawl Money   "+withdra_money+" rs.  Successfully... Now Your Available balance is  "+balance);
	   }
	  else 
	  {
		  System.out.println("Insufficient fund");
	  }
	  		  
	  }
		else if(withdra_money<0)
			
			System.out.println("InValid Input...");			
		
 }
}