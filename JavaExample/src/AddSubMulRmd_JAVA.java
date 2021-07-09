//ARITHMATIC OPERATION 
public class AddSubMulRmd_JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int add,sub,mul,no1,no2;
		 float remd,div;
			no1=Integer.parseInt(args[0]);
			no2=Integer.parseInt(args[1]);
	        add= no1 + no2;
	        sub= no1 - no2;
	        mul= no1 * no2;
	        remd=no1 % no2;
	        div=no1/no2;

	   		System.out.println("ADDITION OF GIVEN NO:"+"  "+no1+"   &  "+no2 +"   =  "+add);
	   		System.out.println("SUBTRACTION OF GIVEN NO:"+"  "+no1+"   &  "+no2 +"   =  "+sub);
	   		System.out.println("MULITION OF GIVEN NO:"+"  "+no1+"   &  "+no2 +"   =  "+mul);
	   		System.out.println("DIVISION OF GIVEN NO:"+"  "+no1+"   &  "+no2 +"   =  "+div);
	   		System.out.println("REMINDER OF GIVEN NO:"+"  "+no1+"   &  "+no2 +"   =  "+remd);


	}

}
