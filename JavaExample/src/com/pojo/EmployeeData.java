package com.pojo;

public class EmployeeData {
	private int empid;
	private String empName;
	private float emp_bsal;
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmp_bsal() {
		return emp_bsal;
	}
	public void setEmp_bsal(float emp_bsal) {
		this.emp_bsal = emp_bsal;
	}
	public EmployeeData(){}
	@Override
	public String toString() {
		return "EmployeeData [empid=" + empid + ", empName=" + empName + ", emp_bsal=" + emp_bsal + "]";
	}

}
