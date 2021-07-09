
public class Avg_Of_Sub {
	
	//initiate properties
	String stud_Name;
	int math_Marks;
	int phy_Marks;
	//Take variables to save static data
    static float avg_math=0;
	static float avg_phy=0;
	static int i=1;
	
	//default constructor
	public Avg_Of_Sub() {
		super();
		// TODO Auto-generated constructor stub
	}
	//overloaded constructor
	public Avg_Of_Sub(String stud_Name, int math_Marks,int phy_Marks) {  //overloaded constructor
		super();
		//int i=1;
		
		this.stud_Name = stud_Name;
		this.math_Marks = math_Marks;
		this.phy_Marks=phy_Marks;
		avg_math=(avg_math+math_Marks)/i;
		avg_phy=(avg_phy+phy_Marks)/i;      //logic to cal avg
		i++;
     
	}
	//create a static method to display avg
	static void getAvg() {
		System.out.println("Class avg maths marks of class are "+avg_math);
		System.out.println("Class avg physics marks of physics are  "+avg_phy);
	}
	
	//Method to display student info
	void getstd_Info() {
		System.out.println(stud_Name +" got "+math_Marks +" in math and " +phy_Marks +" in physics");
	}
	

}
