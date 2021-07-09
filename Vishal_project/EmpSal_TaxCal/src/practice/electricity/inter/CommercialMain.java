package practice.electricity.inter;


public class CommercialMain  {
	 

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Commercial_Enterprise dom;
		dom= new EnterpriseConsumer(123,"java"); 
		int tot=dom.calcBill(130);
		System.out.println("total chgs is "+tot);
	}

}
