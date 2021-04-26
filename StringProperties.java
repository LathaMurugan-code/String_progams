package babe;

public class StringProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashcodes of string
		String name ="latha";
		String name1 ="kalai";
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		//same content-same memory ie same hashcode
		String name2 ="latha";
		String name3 ="kalai";
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		//trying to edit String name and name1
		name = "bae";
		name1 = "babe";
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		//String is immutable when we try to edit string
		//new object memory is created.old memory is 
		//disconnected and pointer points to new memory
		}

}
