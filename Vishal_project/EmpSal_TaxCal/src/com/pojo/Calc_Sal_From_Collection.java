package com.pojo;

import java.util.List;

public class Calc_Sal_From_Collection {

	public Calc_Sal_From_Collection() {
	}
	
	
	void calcSal(List<EmployeeData> li) {
		
		//ed1 is the reference for each object
		for(EmployeeData ed1:li) {
			System.out.println("id "+ed1.getEmpid());
			System.out.println("name "+ed1.getEmpName());
			float hra=.1f*ed1.getEmp_bsal();
			float ca=.12f*ed1.getEmp_bsal();
			int totSal=(int)(ed1.getEmp_bsal()+hra+ca);
			System.out.println("total salary is "+totSal);
			
			
			
		}
	}
}
