package practice.electricity.inter;

import com.electricity.inter.Electric_Domestic;

public class EnterpriseConsumer implements  Commercial_Enterprise {

	 int totalChgs=0;
	 String consName;
	 int consId;
	  
	 EnterpriseConsumer(){}
	 
	 EnterpriseConsumer(int id,String name)//subclass domestic concreate method
	 {
		 consId=id;
		 consName=name;
		 
	 }
	 @Override
		public int calcBill(int no_of_units) {
			// TODO Auto-generated method stub
			 
			// TODO Auto-generated method stub   
			//if units is in the range of 51-100
			if(no_of_units>50 && no_of_units <100) {
				totalChgs+= get_50_100_calc( no_of_units);
			}
			else if(no_of_units > 100) {
				totalChgs+=get_GT_100_calc( no_of_units);
			}
			else {
				totalChgs+=get_Upto_50_calc(no_of_units);
			}  
		
		
			return totalChgs;
		}//end of method
		
		int get_50_100_calc(int no_of_units) //calc bill inner methods
		{
			int subTot=0;
			subTot+=get_Upto_50_calc(50);
			int temp=no_of_units-50;
			subTot+=temp*UNITCOST_51_100;
			return subTot;
		}

		 int get_Upto_50_calc(int no_of_units)//calc bill inner methods
	     {
			 int subTot=0;
			 subTot+=no_of_units*UNITCOST_0_50;
			 return subTot;
				 }
		 
		 int get_GT_100_calc(int no_of_units)//calc bill inner methods
		    {
			 int subTot=0;
			 subTot+=get_50_100_calc(100);
			 int temp=no_of_units-100;
			 subTot+=temp*UNITCOST_GT_100;
			 return subTot;
			 }
	 

}
