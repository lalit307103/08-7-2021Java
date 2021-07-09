//EVEN AND ODD NUMBERS LIST IN GIVEN NO
public class EVENODD_LIST_JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int userNo;
       
       userNo= Integer.parseInt( args[0]);
     System.out.println("SERIES OF EVEN N0 ");     
       for(int i=1;i<=userNo;i++)
       {
    	   if(i%2==0)
    	   {
    		   System.out.println(+i);
    	   }
    	  
       }
       
       
       System.out.println("SERIES OF ODD N0 ");
       for(int i=1;i<=userNo;i++)
       {
    	   if(i%2!=0)
    	   {
    		   System.out.println(+i);
    	   }
    	 
       }
     
       
	}

}
