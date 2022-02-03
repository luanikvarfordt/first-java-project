package intro;

import java.util.*;

public class ArraysDemo {
	
	public static void main(String[] args) {

		// First way of declaring an Array
		int[] myIntArray1; // defining that will be an array with numbers(int), putting [] cause it makes an array and providing an reference for the array
		myIntArray1 = new int [10]; //call the reference first, new keyword, defining data type and how many int will be held in the array
		
		//giving values:
		myIntArray1[0] = 100; //first element is always 0 (then since I have declared 10 int, I'll have 9 values
		myIntArray1[1] = 90;
		
		System.out.println("0 index: " + myIntArray1[0]); // printing element 0
		System.out.println("1st index: " + myIntArray1[1]); //printing second element
		System.out.println("2nd index: " + myIntArray1[2]); //since i haven't given a value for element 2, the default value is 0, but just in this construction
	
		
		// Another way of defyning an array (shorter way):
		int[] myIntArray2 = {100, 90};
		
		System.out.println("0 index: " + myIntArray2[0]);
		System.out.println("1st index: " + myIntArray2[1]);
		// If I have print a third array without defining it, it will error out
		
		
		
		
		//Defynning an array (another way):
		String[] myStringArray1 = {"bmw", "audi", "honda"};
		System.out.println("0 index: " + myStringArray1[0]); //always starts with 0 - bmw
		System.out.println("1st index: " + myStringArray1[1]); //then 1 - audi
		System.out.println("2nd index: " + myStringArray1[2]); // then 2 - honda
		
		
		
		int len1 = myIntArray1.length; // length of myIntArray1 (100,90)
		int len2 = myStringArray1.length; // length of myStringArray1  ("bmw", "audi", "honda")
		
		System.out.println("Int array length: " + len1);
		System.out.println("String array length: " + len2);
		
		for (int i = 0; i < len1; i++){
			System.out.println(myIntArray1[i]);
		}
		
		Arrays.sort(myIntArray1);
		
		for (int i = 0; i < len1; i++){
			System.out.println(myIntArray1[i]);
			
			
			//System.arraycopy(src, srcPos, dest, destPos, length);
		}
	}
}

	
		
