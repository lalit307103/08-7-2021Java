 package com.electricity.inter;

public interface Electric_Domestic {
	int   MIN_CHGS=35;
	float UNITCOST_0_50=1.2f;
	float UNITCOST_51_100 =1.5f;
	float UNITCOST_GT_100=1.7f;
	//CALL THE BILL
public int calcBill(int no_of_units);
}
