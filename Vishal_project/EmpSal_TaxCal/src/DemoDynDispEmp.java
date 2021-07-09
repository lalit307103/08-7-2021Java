// Demo dynamic dispatch method
public abstract class DemoDynDispEmp { // class has use abstract keyword
	
	int empId;
	String empName;

	
	
	public DemoDynDispEmp(int empId, String empName) { // super class constructor
		super();
		this.empId = empId;
		this.empName = empName;
	}

	
	public DemoDynDispEmp() {// default constructor
		super();
		// TODO Auto-generated constructor stub
	}

	
	void dispEmpDetails() {
		System.out.println("Employee Detail are  "+empId + "  " +empName);
	}

	
	abstract int calcSal(); // this method only done using abstract keyword use because its buissness logic
							// is differant
}


  
class RegEmp extends DemoDynDispEmp {
	int bsal;

	public RegEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public RegEmp(int empId, String empName, int bsal) {
		super(empId, empName);
		this.bsal = bsal;
	}

	
	
	int calcSal() {
		int hra = (15 * bsal) / 100;
		int ca = (13 * bsal) / 100;
		return (bsal + hra + ca);

	}



}




class CtrEmp extends DemoDynDispEmp {

	CtrEmp() {
	}

	
	
	CtrEmp(int empId, String empName) {
		super(empId, empName);
	}

	
	// overriding method
	int calcSal() {
		return 10000;
	   }


}
