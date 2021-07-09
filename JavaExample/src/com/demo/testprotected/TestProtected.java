package com.demo.testprotected;

     public class TestProtected 
     {
	     private String pri="i am private";// that visible only within aclass only
    	 
	     int id=103;//default modifier that visible only within package
	    
    	 protected void displaymsg() // protected modifier is visible within class,package and outside the class,package 
	     {                           //through inheritance only ..using extends keywords 
	    	System.out.println("i am from protected method");
	     }
	  public int pub=100;// access level of public modifier is everywhere
 
}
     