//STUDENT CLASS2 HAS MAIN METHOD HAS ACCESS STUDENT CLASS1
public class StudentProcessMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object for student Data Capture
		// inject the values into the above object
		StudentDataCapture sData = new StudentDataCapture(9, "lalit marks", 20,70,60);// we want to creat fpr 5 studet using
																				// array ARRAY OF OBJECTS
		// create an object for Process_Stud_Data for processing the marks
		Process_Stud_Data psd = new Process_Stud_Data();
		// invoking the method
		int totalMks = psd.getTotMks(sData);
		System.out.println("total marks is" + totalMks);

		// the above can also be written

		System.out.println("average is" + psd.getAvg(sData));
		/*
		 * Process_Stud_Data psd = new Process_Stud_Data(sData); Syst out
		 * print("total marks is "+psd.getTotMks()); syst out("avg is"+psd.getAvg());
		 */
		float perCent = psd.getPercnt(sData);
		float b = (perCent / 200) * 100;
         System.out.println("total percentage=  "+b+"%");
		if (90 <= b && 89 <= b) {
			System.out.println("A grade");
		} else if (89 > b && 80 <= b)

			System.out.println("B grade");

		else
			System.out.println(" c grade");

	}

}
