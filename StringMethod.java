class StringMethod
{
public static void main(String [] args)
{
String s = "The learner";
String s1 = " Latha ";
String s2 = "best coder";
System.out.println(s.length());//returns String length
System.out.println(s.charAt(4));//returns character @ specific position index
System.out.println(s.substring(5));//returns from index starting 5
System.out.println(s.substring(1,5));//returns string from index 2-4
System.out.println(s.concat(s1));//joins two strings
System.out.println(s1.indexOf("th"));//returns position index of the character
System.out.println(s.indexOf("e",2));//e-search string ,2-from index starts search
System.out.println(s.lastIndexOf("r"));//returns index of last occur of "r"
System.out.println(s.equals(s1));//compares two strings 
System.out.println("Alan".equalsIgnoreCase("alan"));//compares without case difference
System.out.println(s.toLowerCase());//converts to lowercase
System.out.println(s.toUpperCase());//converts to uppercase 
System.out.println(s1.trim());//cut whitespaces at start&end
System.out.println(s2.replace("best","efficient"));//best-old char with new char
int output = s1.compareTo(s2);//difference b/w ascii values
System.out.println(output);
System.out.println(s2.contains("code"));
System.out.println(s.startsWith("The"));
System.out.println(s.endsWith("ner"));
 }
}
