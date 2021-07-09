
public class FactorialOf_No {

	
		int a=22;
		static double f;
		int i;
		public FactorialOf_No() {
			super();
			// TODO Auto-generated constructor stub
		}
		public FactorialOf_No(int a, int i) {
			super();
			this.a = a;
			this.i = i;
		}
		 double getFact() {
			
			for(i=a;i>1;i--) {
				f=a*(a-1);
			}
			System.out.println(f);
			return f;
		}
		 
		
		 
		
		
	
		
		
	  

	

	

	
}
