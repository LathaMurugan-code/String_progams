package babe;

public class StringPrintingCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letters = "LATHAmurugan8198@#$%";
		char c[]=letters.toCharArray();
		//Capital letters
		for(int i=0;i<letters.length();i++)
		{
			if(c[i]>='A'&&c[i]<='Z')
			System.out.print(c[i]);
		}
		System.out.println();
		//small letters
		for(int i=0;i<letters.length();i++)
		{
			if(letters.charAt(i)>='a'&&letters.charAt(i)<='z')
			System.out.print(letters.charAt(i));
		}
		System.out.println();
		//numbers
		for(int i=0;i<letters.length();i++)
		{
			if(letters.charAt(i)>='0'&&letters.charAt(i)<='9')
			System.out.print(letters.charAt(i));
		}
		System.out.println();
		//Special characters
		for(int i=0;i<letters.length();i++)
		{
			if((c[i]>='A'&&c[i]<='Z')||(c[i]>='a'&&c[i]<='z'))
			continue;
			else if(c[i]>='0'&&c[i]<='9')
			continue;
			System.out.print(c[i]);
		}
		//caps and small letters
		for(int i=0;i<letters.length();i++)
		{
			if(letters.toLowerCase().charAt(i)>='a'&&letters.toLowerCase().charAt(i)<='z')
			System.out.print(letters.charAt(i));
		}
		
		
		
		
		

	}

}
