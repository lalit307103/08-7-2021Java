package com.electricity.inter;

public class DemoElecMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//DomesticConsumer dc= new DomesticConsumer(111,"java");
//better way to implement run time polymorphism
//ref variable of interface pointing to implementing class
Electric_Domestic dom=new DomesticConsumer(123,"java");//
int tot=dom.calcBill(130);
System.out.println("total chgs is "+tot);

	}

}
