//MULITPLICATION TABLE IN GIVEN NUMBER
public class MULTABLE_JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i, user_NO,mult_TABLE;
       
        user_NO=Integer.parseInt(args[0]);
        System.out.println("THE MULTIPLICATION TABLE FOR   "+user_NO);	// please take space for systematic output
    
        for(i=1;i<=10;i++)
        {
            mult_TABLE= user_NO *i;
          	System.out.println(+user_NO+"*"    +i+"  "+mult_TABLE); 	//please take space after any output in println
        }
       
           i++;
        
	}
	
       
	}


