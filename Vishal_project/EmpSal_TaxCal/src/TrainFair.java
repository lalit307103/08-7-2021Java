


 
public abstract class TrainFair {
	
	String trName;
	int trNo;
	String passInfo;
	final int DIST=100;
	
	public TrainFair() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public TrainFair(String trName, int trNo,String passInfo) {
		super();
		this.trName = trName;
		this.trNo = trNo;
		this.passInfo=passInfo;
	}


	abstract void calTrFair();

}



   class PassTrain extends TrainFair{
	    int chrgPerKm=10;

		public PassTrain() {  
			super();
			// TODO Auto-generated constructor stub
		}

		public PassTrain(String trName, int trNo,String passInfo) {
			super(trName, trNo, passInfo);
			// TODO Auto-generated constructor stub
		}
		@Override
		void calTrFair() {
		// TODO Auto-generated method stub
			System.out.println("Details of cust "+trName+" "+" "+trNo+" "+passInfo);
		System.out.println("Charges for passenger  trains are "+chrgPerKm*DIST);
		}
	 
	
	
}
   
   class ExpTrain extends TrainFair{
	  int  chrgPerKm=15;
	  
	  public ExpTrain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExpTrain(String trName, int trNo, String passInfo) {
		super(trName, trNo, passInfo);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calTrFair() {
		// TODO Auto-generated method stub
		System.out.println("Details of cust "+trName+" "+" "+trNo+" "+passInfo);  
		  System.out.println("Charges for Express trains are "+chrgPerKm*DIST);
		
	}
	   
   }