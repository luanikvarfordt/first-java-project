package oopconcepts;

public class addingMethods {

// A practical example for methods	
	
	public static void main(String[] args) {
		findGrades("John", 90);
		findGrades("Tom", 80);
		findGrades("Luani", 70);
		
	}
	
	public static void findGrades(String studentName, int score) {
		String grade;
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println("Grade of " + studentName + " is: " + grade);
	}
	
}
		
//		Inefficient way of doing this:
		
// 	public static void main(String[] args) {		
//		String studentName = "john";
//		int score = 90;
//		String grade;
//		if (score >= 90 && score <= 100) {
//			grade = "A";
//		} else if (score >= 80 && score < 90) {
//			grade = "B";
//		} else if (score >= 70 && score < 80) {
//			grade = "C";
//		} else {
//			grade = "D";
//		}
//		System.out.println("Grade of " + studentName + " is: " + grade);
			
//	 	If I want to have the grades of other students, I could just copy and paste,
//		changing a few things, like example bellow, but This way is not efficient, if
//		I have a lot of students I will be thousands of lines of code		
		
//		studentName = "Tom";  - since it's already defynied as a string, I don't have to call it again
//		score = 80;
//		// I don't need to call grade here
//		if (score >= 90 && score <= 100) {
//			grade = "A";
//		} else if (score >= 80 && score < 90) {
//			grade = "B";
//		} else if (score >= 70 && score < 80) {
//			grade = "C";
//		} else {
//			grade = "D";
//		}
//		System.out.println("Grade of " + studentName + " is: " + grade);
		
		


