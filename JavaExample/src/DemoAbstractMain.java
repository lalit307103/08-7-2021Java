//create a reference to the abstract super class
public class DemoAbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	DemoDynDispEmp ref;
	//object for Reg Emp
	ref = new RegEmp(1,"vishal",1234);
	//RegEmp regEmp = new RegEmp(1,"vishal",1234);
	//applying dyn method dispatch --super class ref var pointing to child class obj
	
     //ref = regEmp;
	//invoking the method of the child class -Reg Emp
	ref.dispEmpDetails();
	System.out.println("register emp sal is "+ref.calcSal());
	
	//ref.calcSal();
	
	// now invoking ctr emp sal
	ref = new CtrEmp(2,"java");
	//ref.calcSal(); 
	ref.dispEmpDetails();
	System.out.println("contract emp sal is "+ref.calcSal());
	
	}

}
