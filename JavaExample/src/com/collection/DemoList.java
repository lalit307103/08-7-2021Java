package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declaring a List collection
//List <Integer>li= new ArrayList<Integer>();
	ArrayList<Integer> al=new ArrayList<Integer>();	//which overloadede constructor is used for that assignment please serch
	//adding objects into the collection
	al.add(10);//automatically converts int value to Integer object-known as Autoboxing 
	al.add(20);
	al.add(30);
	al.add(10);
	al.add(4,35);
	
	//before jdk1.5
	//if you want to add int value then
	Integer i= new Integer(10);
	al.add(i);
	//searching for the object at a Particular index position
	System.out.println("object at 0th position is  "+al.get(0));
	//listing out all the  element in the collection
	
	Iterator  itr = al.iterator();
	//looping throigh the elements
	while(itr.hasNext()) {
			Object o= itr.next();
	System.out.println("element is"+o);
			
	}
//another way to list out all the element  in the collection 
	
	System.out.println("elements in the collection are"+al);
	
	//another way- advanced ,mostly used known as for each object
	
	for(Integer in:al)//all the elements of al is copied to in
		System.out.println(in);
}
}
