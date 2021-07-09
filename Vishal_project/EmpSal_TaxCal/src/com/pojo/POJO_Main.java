package com.pojo;

import java.util.List;

public class POJO_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataRead_Inject_Collection dr=new DataRead_Inject_Collection();
		//read the data ,split and inject into a collection
		List<EmployeeData> l=dr.readData_Inj_POJO();
		System.out.println(l);
		//calculate salary of every employee
		Calc_Sal_From_Collection calc=new Calc_Sal_From_Collection();
		calc.calcSal(l);
		
		//other option to call in short
		new Calc_Sal_From_Collection().calcSal(new DataRead_Inject_Collection().readData_Inj_POJO());

	}

}
