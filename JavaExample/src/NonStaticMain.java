//using simple method how to hold values  at no of object creation
public class NonStaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticDemo nsd = new NonStaticDemo();
		NonStaticDemo nsd1 = new NonStaticDemo();
		NonStaticDemo nsd2 = new NonStaticDemo();
		NonStaticDemo nsd3 = new NonStaticDemo();
		
		System.out.println("output"+nsd.frogCount());
		System.out.println("output"+nsd1.frogCount());
		System.out.println("output"+nsd2.frogCount());
		System.out.println("output"+nsd3.frogCount());
	}

}
