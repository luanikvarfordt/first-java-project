package oopconcepts;

public class PracticingMethods {

	public static void main(String[] args) {
		findOutClassification("Luani", 26);
		findOutClassification("Blake", 26);
		findOutClassification("Stella", 12);
		findOutClassification("Killian", 2);
		findOutClassification("Luciene", 52);

	}
	
	public static void findOutClassification(String name, int age) {
		String status;
		if (age >= 12 && age <= 20) {
			status = "Youth";
		} else if (age >= 1 && age < 12) {
			status = "Child";
		} else if (age > 20 && age < 35) {
			status = "Young Adult";
		} else {
			status = "Old as heck!";
		}
		System.out.println("Based on age " + name + " is " + status);
	}

}
