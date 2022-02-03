// package intro;

// public class NonPrimitiveDataTypes {

//	public static void main(String[] args) {

//		 Non-Primitive Data Types in Java:
//		 Strings, Arrays, Objects, Classes, Interfaces
//		
//		 STRING
//		 in Java, a STRING is an object that represents
//		 an array or sequence of characters.
//		 The java.lang.String is the class is used for creating a string object.

//		 creating a string object:
//	   	 String string1 = "Hello World"; ---> declaring string using string literals
//	     String string2 = new String("This is TechVidvan Java Tutorial "); ---> declaring string using new operator
// 	     System.out.println(string1);
//	     System.out.println(string2);

//       	String s1 = "abcde";
//			String s2 = new String("abcde");
//			String s3 = "abcde";
//			All are valid, but have a slight difference. s1 will refer to an interned String object. 
//			This means, that the character sequence "abcde" will be stored at a central place, and whenever 
//			the same literal "abcde" is used again, the JVM will not create a new String object but use the 
// 			reference of the cached String.

//			String s1 = "abcde";
//			String s2 = new String("abcde");
//			String s3 = "abcde";
//			s2 is guranteed to be a new String object, so in this case we have:
			
//			It prints:
//			s1 == s2 // is false
//			s1 == s3 // is true
//			s1.equals(s2) // is true
	    
	    
	    // ARRAY
	    /* An ARRAY in Java is a single object which can store
	    * multiple values of the same data type.
	    * Two steps are in creating an array:
	    * 1 - Array Declaration: 
	    * data-type array_name [ ];
	    * data-type [ ] array_name; */
	    // example:
	    // int daysInMonth [];
	    // char [] lettersInSentence;
	    // double salaryOfEmployees [];
	    // String progLanguages[];
	    
	    /* 2 - Array Initialization
	    * array_name = new data-type [size of array];
	    * array_name = new data-type {elements of array using commas};
	    EXAMPLE: */
	    // daysInMonth = new int [100];
	    // lettersInSentence = new char [5];
	    // salaryOfEmployees = new double [] {10000, 50000, 30000, 25000, 40000};
	    // progLanguages = {"C", "Java", "Ruby", "Phyton", "PHP"};
	    // Combining two steps we can create an array as follows:	     
	    // data-type array_name [] = new data-type [size of array];
	    // data-type [] array_name = new data-type [size of array];
	    // data-type array_name [] = new data-type {elements of array using commas};
	    // ** If the elements of an array are not given then Java stores
	    // the value of each element with 0**
	  //  int [] marksOfStudents = new int[] {65, 90, 78, 60, 84};
	  //  System.out.println("Marks of first student: " +marksOfStudents[0]);
	  //  System.out.println("Marks of second student: " +marksOfStudents[1]);
	  //  System.out.println("Marks of third student: " +marksOfStudents[2]);
	  //  System.out.println("Marks of fourth student: " +marksOfStudents[3]);
	  //  System.out.println("Marks of fifth student: " +marksOfStudents[4]);
	    
	    
	    // CLASSES
	    // A CLASS is a collection of objects of the same type
	    // 1. Access modifiers: Access modifiers define the access privileges of 
	    // a class. A class can be public or it has default access.
	    // 2. Class name: The name of a class should represent a noun and must 
	    // start with a capital letter. These are the best practices to be kept 
	    // in mind while declaring any class.
	    // 3. Body: The class body contains properties and methods.
	    // The body is always enclosed by curly braces { }.
	    // AccessModifier class class_name
	    // {
	    // Class body - variables and methods();
	    // }
	   // public class MyClass
	   // {
	   //   int x = 5;
	   //   void display()
	   //   {
	      // methodBody;
	   //   }
	   // }
	    
	//}

// }	    
	    // OBJECTS
	    // An object is an instance of a class. It defines the state and behavior of
	    // real life entities. For example, an object "dog" has states like name,
	    // breed, color, size, age, and functions like bark, eat, run, sit.
	    // To create and object of a class, specify the class name, followed by the 
	    // object name, by using the new keyword:
	    // class_name object_Name = new class_name();
	    // Example: MyClass object1 = new MyClass();

	    //public class Student
	    //{
	    //	int marks = 76;
	    //	public static void main(String[] args)
	    //	{
	    //		Student student1 = new Student();
	    		// creating object of the class by using new operator		
	    //		System.out.println("Marks of student: " +student1.marks);
	    		//Accessing the property "marks" of the class with the help of an object
	    //	}
	    //}
	    
	    
	    // INTERFACES
	    // It is another reference type in Java. it's similar to a class, it can have
	    // methods and variables, but methods are declared as public and abstract in
	    // interfaces.
	    // EXAMPLE:
	    
	    // interface interface_name
	    
	    // To use an interface in a class, put keyword "implements" after the class
	    // name followed by the interface name
	    // EXAMPLE:
	    
	    // class class_name implements interface_name
	    
	    //interface Serializable
	    //	{ 
	    	// Abstract methods
	    //	}
	    //class MyClass implements Serializable
	    //	{
	    		//class body
	    //	}
	    
	    //creating an interface
	    //interface Runnable
	    //{
	    //	public void run(); //an abstract method
	    //}
	    	//implementing the interface
	    //public class Person implements Runnable
	    //{	public void run()
	    //	{
	    //	System.out.println("This person can run");
	    //	}
	    
	    //	public static void main(String args[])
	    //	{
	    //		Person person1 = new Person();
	    //		person1.run();
	    //	}
	    //}
	    
	    
	    






