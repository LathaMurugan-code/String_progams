package babe;

public class StringSpiltAnother {
		public void splitString(char split, String main) 
		{
	char[] fullString = main.toCharArray();
	//String to character array conversion
	for (int i = 0; i < fullString.length; i++) {
	if (fullString[i] == split) {
	char[] first = new char[i];
	//create char arr for first string with 
	//the size of i th position(delimiter" ") 
	for (int x = 0; x < i; x++) {
		//since we have to store before the delimiter
		//x<i
	first[x] = fullString[x];
	//till x position String is saved
		}
	String firstString = String.valueOf(first);
	//conversion of char arr to string
	System.out.println(firstString);

	char[] second = new char[fullString.length - i + 1];
	//put remaining string after delimiter position
	//in char arr second
	int z = 0;
    for (int y = i + 1; y < fullString.length; y++) {
    second[z] = fullString[y];
	z++;
		}
    String secondString = String.valueOf(second);
	splitString(split, secondString);
	//recursion to split remaining strings 
	System.out.println(secondString);
	System.exit(0);
	 }
	}
		}

	public static void main(String args[]) {
	StringSpiltAnother obj = new StringSpiltAnother();
	obj.splitString(' ', "Orange is good for health");
		}
		}




