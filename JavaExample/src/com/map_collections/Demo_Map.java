package com.map_collections;

import java.util.HashMap;
import java.util.Map;

public class Demo_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>m=new HashMap<String,String>();
		//to add an object into the map
		m.put("name","Java");
		m.put("desg", "Developer");
		m.put("OS","Windows 12");
		m.put("OS", "Linux");
		m.put("id", "Linux");
		
		//to display elements of the map
		System.out.println(m);
		//to retrive the value given by 
		System.out.println(m.get("name"));
		
		//to check if a given key is exist
		if(m.containsKey("OS")) {
			System.out.println("it is exist");
			System.out.println(m.get("OS"));
			//displaying all keys in the map
			System.out.println("all keys in the map"+m.keySet());
			
			m.remove("name");  //remove the key-name and associate value from the map
			System.out.println(m);
			//retrive all the values from the map
			System.out.println("All key values"+m.values());
		}
		

	}

}
