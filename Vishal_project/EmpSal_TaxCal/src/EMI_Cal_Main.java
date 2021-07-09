
public class EMI_Cal_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal_amnt = Double.parseDouble(args[0]);
        
        double rate = Double.parseDouble(args[1]);
               
        double time = Double.parseDouble(args[2]);
        
        EMI_Cal emi=new EMI_Cal(principal_amnt,rate,time);
        
        emi.getEMI();

	} 

}
 