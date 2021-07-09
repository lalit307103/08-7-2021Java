package Collection_Set;

import java.util.HashSet;
import java.util.Set;

public class Demo_Set_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student>s1=new HashSet<Student>();
		
		Student s2=new Student(101,"Java");
		Student s3=new Student(101,"Java");
		Student s4=new Student(102,"Java");
		Student s5=s2;
		System.out.println("s2 equals s3"+s2.equals(s3));
		System.out.println("s3 equals s4 "+s3.equals(s4));
		System.out.println("s4 equals s3 "+s4.equals(s3));
		System.out.println("s5 equals s2"+(s5==s2));
		
		System.out.println("hashcode-s1 and s4 "+s1.hashCode()+" "+s4.hashCode());
		
		//adding objects to set collection
		s1.add(s2);
		s1.add(s3);
		s1.add(s4);
		s1.add(s5);
		System.out.println(s1);

	}

}


class Student{
	int stdId;
	String stdName;
	Student(int id,String name){
		stdId=id;
		stdName=name;
		
	}
	//here we are override the hashcode and comparable 
	public int hashCode() {
		return (stdId+2);
	}
	public boolean equals(Object obj) {
		//first check for the instance of the right object
		//secondly, check if the value of id is same or not
		if((obj instanceof Student)&&((Student)obj).stdId==this.stdId)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + "]";
	}
}

