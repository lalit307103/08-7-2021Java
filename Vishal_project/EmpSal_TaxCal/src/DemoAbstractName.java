 
public class DemoAbstractName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a reference to the abstract super class
		
		DemoDynDispEm ref;
		
		//Object for regular emp
		RegEmp regEmp=new RegEmp(1,"Vishal",1245);
		
		//applying dyn method dispatch-- super class ref variable pointing to child class obj
		ref=regEmp;
		ref.dipEmpDetails();
		
		//invoking the method of the child class--Regemp
		System.out.println(ref.calSal());
		
		//now invoking cntr emp sal
		ref=new CtrEmp(2,"Java");
		System.out.println(ref.calSal());
		ref.dipEmpDetails();
		

	}

}
