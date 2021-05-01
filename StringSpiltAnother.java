package babe;

public class StringSpiltAnother {
		public void splitString(char split, String main) {
		char[] fullString = main.toCharArray();
		for (int i = 0; i < fullString.length; i++) {
		if (fullString[i] == split) {
		char[] first = new char[i];
		for (int x = 0; x < i; x++) {
		first[x] = fullString[x];
		}
		String firstString = String.valueOf(first);
		System.out.println(firstString);

		char[] second = new char[fullString.length - i + 1];
		int z = 0;
		for (int y = i + 1; y < fullString.length; y++) {
		second[z] = fullString[y];
		z++;
		}
		String secondString = String.valueOf(second);
		splitString(split, secondString);
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


