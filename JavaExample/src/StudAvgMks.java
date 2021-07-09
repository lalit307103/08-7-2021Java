
public class StudAvgMks {
	public int mrks_math,mrks_phy;
	public float avgMrks_math, avgMrks_phy;
	static float mrks_total=0;
	static int i=1;
	public String stud_name;
	
	public StudAvgMks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudAvgMks(int mrks_math,String stud_name) {
		super();
		this.mrks_math = mrks_math;
		//this.avgMrks_math = avgMrks_math;
	    //this.mrks_total = mrks_total;
	    this.stud_name = stud_name;
	    mrks_total = mrks_total + mrks_math;
	    avgMrks_math = mrks_total/i;
	   
	    i++;
	    
	}
	 
	
	public void dispStudentAvg()
	{
		System.out.println("Average Marks is "+avgMrks_math);
		 
		
	}
	
	

}
