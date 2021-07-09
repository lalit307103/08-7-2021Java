
public class ConstructorDefination {
String def_Constructor;
	
	String constructorDefinition()
	{
		def_Constructor = "In Java, a constructor is a block of codes similar to the method.\n "
				+ "It is called when an instance of the class is created.\n "
				+ "At the time of calling constructor, memory for the object\n "
				+ "is allocated in the memory.\n"
				+ "It is a special type of method which is used to initialize the object.\n"
				+ "Every time an object is created using the new() keyword, at least one constructor\n"
				+ "is called.It calls a default constructor if there is no constructor available\n "
				+ "in the class. In such case, Java compiler provides a default constructor by default\n"
                + "There are two types of constructors in Java: no-arg constructor\n, "
                + "and parameterized constructor.Note: It is called constructor because\n "
                + "it constructs the values at the time of object creation.\n"
                + "It is not necessary to write a constructor for a class.\n "
                + "It is because java compiler creates a default constructor\n "
                + "if your class doesn't have any constructor";
		 		       
	return  def_Constructor;
	}

}
