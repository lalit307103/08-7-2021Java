package com.Intrfac_electricity;

public class Domestis_Electricity_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Domestic_Consumer dc=new Domestic_Consumer(111,"vishal");
		//better way to implement runtime polymorhism
		//ref variable of interface pointing to implementing class
		Electric_Domestic dom=new Domestic_Consumer(123,"java");
		int bill=dom.calcBill(130);
		System.out.println("Totl bill is "+bill);
		 bill=dc.calcBill(100);
		System.out.println("bill is" +bill);

	}

}
