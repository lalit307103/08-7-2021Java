//not an efficient program
public class DemoInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]= {"math","phy","chemistry"};
		CollegeData cData = new CollegeData(2021,"java",s);
		cData.dispdata();
		
	}

}
 //thats program 1) superclass properties are not injected
//jvm is taking time as to which method should be invoke   