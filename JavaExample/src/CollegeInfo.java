
public class CollegeInfo {
	private int enrol_Yr;
	private String stud_Name;
	void exCollageMethod ()
	{ 
		
	}
	CollegeInfo() 
	{
	}

	public CollegeInfo(int enrol_Yr, String stud_Name) {
		//super();
		this.enrol_Yr = enrol_Yr;
		this.stud_Name = stud_Name;
	}
  // private String stdName;

	void dispdata() {
		System.out.println("super class data. is" + enrol_Yr + stud_Name);
	}

}

class CollegeData extends CollegeInfo { 
	String sub[];

	CollegeData() {
	}

	public CollegeData(int yr,String name,String sub[])
	{
		super(yr,name);//should be the first statment
		this.sub = sub;
	}

	 
	

	// method overriding
	void dispdata() {

		      {
		    	  super.dispdata();
			System.out.println("child class");
			for (int i = 0; i<sub.length; i++) 
			{
				System.out.println(sub[i]);
			}
		}
	}
}
//static,polimorphism see H.W,IO stream application,packages,exception handling imp 