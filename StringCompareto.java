package babe;

public class StringCompareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java program to Compare two strings
		// lexicographically

	String string1 = new String("butter");
    String string2 = new String("dog");
	String string3 = new String("Cat");
	String string4 = new String("mop");

	// Comparing for String 1 < String 2
	System.out.println("Comparing " + string1 + " and " + string2
								+ " : " + string1.compareTo(string2));

	// Comparing for String 3 = String 4
	System.out.println("Comparing " + string3 + " and " + string4
								+ " : " + string3.compareTo(string4));

	// Comparing for String 1 > String 4
	System.out.println("Comparing " + string1 + " and " + string4
								+ " : " + string1.compareTo(string4));
			
		


	}

}
