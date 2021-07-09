//Array  Initialization and print
public class Array_Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];// Declaration and initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		// Printing Array
		int i;
		for (i = 0; i <= a.length; i++) {

			System.out.println(a[i]);
		}
	}
}
