package com.Intrfac_electricity;

public interface Electric_Domestic {
	int MIN_CHGS=35;
	float PER_UNITCOST_0_50=1.2f;
	float PER_UNITCOST_51_100=1.5F;
	float PER_UNITCOST_GT_100=1.7F;
	
	//CALCULATE THE BILL
	 public int calcBill(int no_of_units) ;
		

}
