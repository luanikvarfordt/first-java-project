package oopconcepts;

public class MethodsDemo {

	static String a = "Hey, there !!!";
	
	public static void main(String[] args) {
//		this is a method. A method is a way to do something. Everything in Java will
//		go under methods. We can define variables outside a method but we can't call an action
//		or print it outside the method. Anytime we call something, it has to be inside the 
//		main method
//		every java class needs a main method
		System.out.println(a); //it will still print even if the variable we are calling is outside the method
	}	//remember to close a method to start a new one. A method can't exist inside other method
	
//		It needs a main method, if I create a main method and I comment it out, it won't
//		give me the option to run the code for the second method:
	public static void methodNum() {
		String a = "Hey, there !!!";
		System.out.println(a);

	}

}
