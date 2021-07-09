package com.collection;

import java.net.InterfaceAddress;
import java.util.LinkedList;
import java.util.jar.Attributes.Name;

public class StudentCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<StudentData> ll= new LinkedList<StudentData>();
//adding student objects into the collection

StudentData sd=new StudentData(103,"web services");
ll.add(new StudentData(101,"java"));
ll.add(new StudentData(102,"spring"));
ll.add(sd);
ll.addFirst(new StudentData(105,"hibernate"));
System.out.println(ll );
for(StudentData s:ll) {
	System.out.println("id is"+s.stdId);
	System.out.println("name is "+s.stdName);
    System.out.println(s);
    
}
	}

}
class StudentData{
	@Override
	public String toString() {
		return "StudentData [stdId=" + stdId + ", stdName=" + stdName + "]";
	}
	int stdId;
	String stdName;
	StudentData(){}
	StudentData(int id,String name){
		stdId=id;
		stdName=name;
		
	}
}