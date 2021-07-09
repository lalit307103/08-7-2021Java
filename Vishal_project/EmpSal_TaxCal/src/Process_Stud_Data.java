
public class Process_Stud_Data {
//process the total mks
	int getTotMks(StudentDataCapture sd) {
		int totalMks = (sd.mks_csc+sd.mks_mm);
		//return (sd.mks_csc+sd.mks_mm+sd.mks_pol);
		return totalMks;
	}
	float getAvg(StudentDataCapture sd) {
		return((sd.mks_csc+sd.mks_mm+sd.mks_pol)/2);
		 
		/* StudentDataCapture sd;
		 * Process_Stud_Data(StudentDataCapture sd){
		 * this.sd= sd;
		 * }
		 * int getTotMks(){
		 * return(sd.mks_csc+ sd.mks_mm);
		 * }
		 * float getAvg(){
		 * return ((sd.mks_mm+sd.mks_csc)/2);
		 * }
		 */
	}
	 float getPercnt(StudentDataCapture sd)
	 {
		 return((sd.mks_csc+sd.mks_mm));
	 }
	 

	
	}

