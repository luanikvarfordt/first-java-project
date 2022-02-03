package intro;

public class StringMethods {

	public static void main(String[] args) {
		/*
		 *  String'length() " length!of!the!string
			String'charAt() " returns!a!char!value!at!the!given!index!number
			String'concat() " combines!specified!string!at!the!end!of!this!string
			String'contains() " returns!true if chars are!found!in!the!string
			String'startsWith() " checks!if!this!string!starts!with!given!prefix
			String'endsWith() " checks!if!this!string!ends!with!given!suffix
			String'equals() " compares!the!contents!of!two!given!strings
			String'indexOf() " returns!index!of!given!character!value!or!substring
			String'isEmpty() " checks!if!this!string!is!empty
			String'replace() " returns!a!string!replacing!all!the!old!char!to!new!char
			String'substring() " returns!a!part!of!the!string
			String'toCharArray() " converts!this!string!into!character!array
			String'toLowerCase() " returns!the!string!in!lowercase!letter
			String'toUpperCase() " returns!the!string!in!uppercase!letter
			String'trim() " eliminates!leading!and!trailing!spaces
		 */
		
		String str = "This is the test string";
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "        Spaces all around      ";
		String str6 = "Hello";
		
		System.out.println(str.length()); //length of the string
		System.out.println(str.charAt(2)); //because 2 is the third character(it always starts in 0)
		System.out.println(str.concat(". This is the appended string")); //it adds up to the object
		System.out.println(str.contains("is")); //checks to see if there is "is"
		System.out.println(str.contains("si")); //checks to see if there is "si"
		System.out.println(str.startsWith("This")); //checks to see if starts with something
		System.out.println(str.startsWith("is")); //checks to see if starts with something
		System.out.println(str.endsWith("string")); //looks for what ends with
		System.out.println(str.endsWith("is")); //looks for what ends with
		System.out.println(str1.equals(str2)); //checks if str1 has same value of str2
		System.out.println(str1.equals(str3)); //checks if str1 has same value of str3
		System.out.println(str.indexOf('n')); //check where n is located in sentence as far as numbers go starting from 0
		System.out.println(str.isEmpty()); //check if string is empty
		System.out.println(str4.isEmpty()); //check if string is empty
		System.out.println(str5.trim()); //eliminate spaces
		System.out.println(str6.replace('e', 'a')); //replace old character with new
		System.out.println(str.substring(5)); // cuts wherever you want 
		System.out.println(str.substring(5, 10)); // cuts and pick up whenever you want, but last number is exclusive (so it will print 9)
		
		char[] charArray = str.toCharArray();
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("Index " + i + " is: " + charArray[i]);
		}
		
		System.out.println(str.toLowerCase()); // turn it into lower case
		System.out.println(str.toUpperCase()); // turn it into upper case
		
		
		
		
		
		
		
		
		
		System.out.println("Length of the string is: " + str.length());
		System.out.println("Character at index 2 is: " + str.charAt(2));
		System.out.println(str.concat(" This is the appended string"));
		System.out.println("Contains check 1: " + str.contains("is"));
		System.out.println("Contains check 2: " + str.contains("si"));
		System.out.println("Starts with check 1: " + str.startsWith("This"));
		System.out.println("Starts with check 2: " + str.startsWith("is"));
		System.out.println("Ends with check 2: " + str.endsWith("string"));
		System.out.println("Ends with check 2: " + str.endsWith("is"));
		System.out.println("Check contents are equal: " + str1.equals(str2));
		System.out.println("Check contents are equal: " + str1.equals(str3));		
		System.out.println("Index of 'h' is: " + str.indexOf('h'));
		System.out.println("Check if string is empty 1: " + str.isEmpty());
		System.out.println("Check if string is empty 2: " + str4.isEmpty());
		System.out.println("Trim the leading and trailing spaces: " + str5.trim());
		System.out.println("Replace Example: " + str6.replace('e', 'a'));
		
		System.out.println("Substring Example 1: " + str.substring(5));
		System.out.println("Substring Example 2: " + str.substring(5, 10));
		
		char[] charArray2 = str.toCharArray();
		for (int i = 0; i<charArray2.length; i++) {
			System.out.println("Index " + i + " is: " + charArray2[i]);
		}
		
		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Upper case: " + str.toUpperCase());

		
		String a = "Hello";
		String b = "World";
		String c = a + " " + b;
		
		System.out.println(a.concat(" ")+b);
		System.out.println(a + " " +b);
		System.out.println(c);
		
	}

}
