
public class DataTypes {

	String dt[];
	
	
	
	

	
	
	public DataTypes(String[] dt) {
		super();
		this.dt = dt;
	}





	String[] getData() {
		String s[]= {"Data types specify the different sizes and values that can be stored in the variable int 2 byte","Primitive data types:",
				"The primitive data types include boolean, char, byte, short, int, long, float and double.",
				"Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays"};
		
		for(int i=0;i<s.length;i++) {
		System.out.println(s[i]);
		}
		System.out.println("boolean data type\r\n" + 
				"byte data type\r\n" + 
				"char data type\r\n" + 
				"short data type\r\n" + 
				"int data type\r\n" + 
				"long data type\r\n" + 
				"float data type\r\n" + 
				"double data type ");
		
      return s;
			

	}

	public DataTypes() {
		super();
	}
	
	
	
	
}


