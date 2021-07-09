package Collection_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1=new HashSet<Integer>();
		
		//adding integer object to a collection
		s1.add(2);
		s1.add(5);
		s1.add(5);
		s1.add(1);
		System.out.println("HS"+s1);
		
		Set<Integer> s2=new TreeSet<Integer>(s1);
		System.out.println("TS"+s2);
		
		Set<String> s3=new LinkedHashSet<String>();
		s3.add("adcd");
		s3.add("acdb");
		s3.add("abcd");
		s3.add("java");
		s3.add("java");
		s3.add("JAVA");
		s3.add(" java");  //space
		s3.add("10");
		s3.add("10");
		System.out.println(s3+"LHS");
		
		Set<String> s4=new TreeSet<String>(s3);
		System.out.println("TS"+s4);
	}

}
