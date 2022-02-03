package intro;

public class MyPrimitiveDataTypes {

	public static void main(String[] args) {
		
		// JAVA Characters (char)
		char room, grade;
		room = '9';
		grade = 'B';
		System.out.println("Room: " + room);
	    System.out.println("Grade: " + grade);
	    grade++;
	    System.out.println("The increment value of grade: " + grade);
	    
	    char myChar1 = 'A';
	    char myChar2 = 'B';
	    System.out.println("myChar1: " +myChar1);
	    System.out.println("myChar2: " +myChar2);
	    myChar2++; // valid increment operation
	    System.out.println("The Incremented value of myChar2: " +myChar2);
	    
	    // JAVA Integers (byte, short, int, long)
	    // stores whole numbers that may be positive or negative and 
	    // should not contain any decimal places
	    // What type will be taken depends on the value or range of the variable
	    
	    byte myByte1, myByte2;
	    myByte1 = 127;
	    myByte2 = -48;
	    System.out.println("Byte 1: " + myByte1);
	    System.out.println("Byte 2: " + myByte2);
	    myByte1++; //looping back within the range
	    System.out.println("Incremented Value of myByte1: " + myByte1);
	    
	    short myShort = 6000;
	    System.out.println("myShort: " + myShort);
	    
	    int myNum1, myNum2, result;
	    myNum1 = -7000;
	    myNum2 = 90000;
	    result = myNum1 + myNum2;
	    System.out.println("Number 1: " + myNum1);
	    System.out.println("Number 2: " + myNum2);
	    System.out.println("Number 1 + Number 2: " + result);
	    
	    // It is used when int data type cannot hold a value
	    // It is 2 times larger than int(integer)
	    // We must use L at the end of the value
	    long myLong1, myLong2, resultForLong;
	    myLong1 = 100000000L;
	    myLong2 = 200L;
	    resultForLong = myLong1 * myLong2;
	    System.out.println("Number 1: " +myLong1);
	    System.out.println("Number 2: " +myLong2);
	    System.out.println("Number 1 * Number 2: " +resultForLong);
	    
	    // It can store fractional numbers
	    // Always end it with f or F
	    
	    float myFloat1, myFloat2, resultForFloat;
	    myFloat1 = 1000.666f;
	    myFloat2 = 110.77f;
	    resultForFloat = myFloat1-myFloat2;
	    System.out.println("Number1: " +myFloat1);
	    System.out.println("Number2: " +myFloat2);
	    System.out.println("Number1-Number2: " +resultForFloat);
	    
	    // decimal digits
	    //Use d or D to end of floating type value
	    double myDouble1, myDouble2, resultForDouble;
	    myDouble1 = 48976.8987;
	    myDouble2 = 29513.7812d;
	    resultForDouble = myDouble1 + myDouble2;
	    System.out.println("Number 1: " +myDouble1);
	    System.out.println("Number 2: " +myDouble2);
	    System.out.println("Number 1 + Number 2: " +resultForDouble);
	    
	    // true or false values only
	    boolean myBool = true;
	    if(myBool == true)
	    	System.out.println("I am using a Boolean data type");
	    	System.out.println(myBool);
	    

	}

}