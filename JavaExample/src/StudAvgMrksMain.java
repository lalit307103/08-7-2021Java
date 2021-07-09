
public class StudAvgMrksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudAvgMks studAvg0 = new StudAvgMks(50,"lalit");
System.out.println(""+studAvg0.stud_name+"  math marks is  "+studAvg0.mrks_math+"");
System.out.println("");
StudAvgMks studAvg1 = new StudAvgMks(60,"vishal");

System.out.println(""+studAvg1.stud_name+"  math marks is  "+studAvg1.mrks_math+"");

System.out.println(""+studAvg0.stud_name+" &  "+studAvg1.stud_name+" " );
//studAvg0.dispStudentAvg();
studAvg1.dispStudentAvg();	

/*StudAvgMks studAvg2 = new StudAvgMks(70,"vishal");
studAvg2.dispStudentAvg();*/
	}

}
