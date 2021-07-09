package practice.electricity.inter;

public interface Commercial_Enterprise {
	int MIN_CHGS=800;
	float UNITCOST_0_50=4.5f;
	float UNITCOST_51_100 =6.5f;
	float UNITCOST_GT_100=8.0f;
	//CALL THE BILL
public int calcBill(int no_of_units);
}
