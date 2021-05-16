package recursion;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SortString s = new SortString();
     String k = "lava"; 
     s.sortLastCharacter(k, 3);
	}

	public void sortLastCharacter(String s,int i)
	{
		// TODO Auto-generated method stub
		char temp ='0';
		char c[]=s.toCharArray();
		if(c[i-1]>c[i]&&i>=1)
		{
			temp = c[i-1];
			c[i-1]=c[i];
			c[i]=temp;
			 String v = String.valueOf(c);
			sortLastCharacter(v,i-1);
			System.out.println(v);
			}
		String k = new String(c);
		int j=3;
		if(j>=1)
		{
			sortLastCharacter(k,j-1);
			}
		}
	

}
