package com.collection;

import java.util.List;



import java.util.ArrayList;
import java.util.Iterator;

public class Demolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring a list collection
		
		List<Integer> li=new ArrayList<Integer>();
		//ArrayList<float> al=new ArrayList<float>();
		li.add(10);  //automatically converts int value to integer object-known as autoboxing 
		li.add(20);
		li.add(40);
		li.add(10);
		li.add(4, 25);   //it is the method to add at index location
		
		//before jdk 1.5 if you want to add int value then
		Integer i= new Integer(10);
		li.add(i);
		// searching for the object at a particular index position by using get()
		
		System.out.println("object at 0th position is "+li.get(0));
		
		//listing all the values in the collection
		Iterator itr=li.iterator();
		
		//looping through the elements
		
		while(itr.hasNext()) {
			Object o=itr.next();
			System.out.println("element is "+o);
		}
		
		//another way to list out all the elements in the collection
		System.out.println("elements in the collection are "+li);
		
		//another way-advanced, mostly used known as for each object
		
		for (Integer in:li)  //all the elements or objects of li will copied into in
			System.out.println(in);
		
		

	}

}
