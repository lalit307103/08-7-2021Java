//VIJAY SIR CLASS EXAMPLE FOR CONSTRUCTOR OVERLAODING FOR EMPLOYEE CLASS 2
public class EmployeeData {
	// PROPERTIES
	int empId;
	String empName;

	// default constructor
	EmployeeData() {

	}

	// Overloaded Constructor
	EmployeeData(int id, String name) {
		empId = id;
		empName = name;

	}

	// method
	void dispEmpData() {
		System.out.println("employee data" + empId + "" + empName);
	}
}
