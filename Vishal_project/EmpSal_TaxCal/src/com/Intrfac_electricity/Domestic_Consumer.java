package com.Intrfac_electricity;

public class Domestic_Consumer implements Electric_Domestic {
int totalchgs=0;
String ConsName;
Domestic_Consumer(){
}


	public Domestic_Consumer(int totalchgs, String consName) {
	super();
	this.totalchgs = totalchgs;
	this.ConsName = consName;
}


	@Override
	public int calcBill(int no_of_units) {
		// TODO Auto-generated method stub
		//if the units are in the range of 51-100
		
		if(no_of_units>50&&no_of_units<100) {
			totalchgs+=get51_100calc(no_of_units);
		}
		else if(no_of_units>100) {
			totalchgs+=get_GT_100_calc(no_of_units);
			
		}
		else {
			totalchgs+=get_upto_50_calc(no_of_units);
		}
		
		
		return totalchgs;
	}//end of the method
	
	public int get51_100calc(int no_of_units) {
		int subTotl=0;
		subTotl+=get_upto_50_calc(50);
		int temp=no_of_units-50;
		subTotl+=temp*PER_UNITCOST_51_100;
		return subTotl;
		

		
	}
	public int get_GT_100_calc(int no_of_units) {
		int subTotl=0;
		subTotl+=get51_100calc(100);
		int temp=no_of_units-100;
		subTotl+=temp*PER_UNITCOST_GT_100;
		return subTotl;
		
		
		
		
	}
	
	int get_upto_50_calc(int no_of_units) {
		int subTotl=0;
		subTotl+=no_of_units*PER_UNITCOST_0_50;
		return subTotl;
		
		
	}
	
	

}
