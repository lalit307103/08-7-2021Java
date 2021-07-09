// EMPLOYEE 3 CLASS MAIN FOR CLASS 1 AND CLASS 2
public class DemoEmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reference variable
		EmployeeData emp; // emp is pointing to null

		// creating an object and injecting values
		emp = new EmployeeData(100, "   1st EMPLOYEE  SAGAR ");
		// invoking the method
		emp.dispEmpData();

		EmployeeData emp2 = new EmployeeData();
		emp2.empId = 101;
		emp2.empName = "   2nd EMPLOYEE LALIT";
		emp2.dispEmpData();

		EmployeeData emp3 = emp;
		// emp3.dispEmpData();

		// finding the memory Location

		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());

		// EmployeeData emp4= new EmployeeData();
		// emp4.dispEmpData();

		Employee emp5 = new Employee(101, "  LALIT BEDSE  ", 300000.0f);
		// calculate the salary

		// int sal= emp5.getEmpSal();
		emp5.getEmpSal();

	}

}
