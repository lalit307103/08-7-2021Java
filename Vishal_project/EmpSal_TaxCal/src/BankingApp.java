
public class BankingApp {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTransaction bn=new BankTransaction();
		try {
			bn.getWithdrawl(1000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Balance is not sufficient pls chk");
			e.printStackTrace();
		}
		
		try {
			bn.cashDeposit(100);
		} catch (NegativeDepositionException e) {
			// TODO Auto-generated catch block
			System.out.println("pls deposit more than 100 rs");
			e.printStackTrace();
		}

	}

}


class InsufficientFundsException extends Exception{
	int witdAmnt;
	
	InsufficientFundsException(int witdAmnt){
		this.witdAmnt=witdAmnt;
	}
	
	
}

class NegativeDepositionException extends Exception{
	int depAmnt;
	NegativeDepositionException(int depAmnt){
		this.depAmnt=depAmnt;
	}
	
	
}


class BankTransaction{
	int depAmnt;
	int witdAmnt;
	static double bal=20000;
	
	BankTransaction(){
		
	
		//this.witdAmnt=witdAmnt;
		//this.depAmnt=depAmnt;
	}
	
	void getWithdrawl(int witdAmnt) throws InsufficientFundsException{
		if(witdAmnt>bal) {
			throw new InsufficientFundsException(witdAmnt);
		}
		else {
			System.out.println("your remaining balance after withdraw is "+(bal-witdAmnt));
			bal-=witdAmnt;
		}
		
	}
	
	void cashDeposit(int depAmnt) throws NegativeDepositionException{
		if(depAmnt<=0) {
			throw new NegativeDepositionException(depAmnt);
			
		}
		else {
			System.out.println("Your balance after deposition is "+(bal+depAmnt));
		}
		
	}
	
}