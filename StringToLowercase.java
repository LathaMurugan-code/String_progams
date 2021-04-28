package babe;

public class StringToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "LATHA";
		char c[] = name.toCharArray();
		//caps to small letter conversion
		for(int i=0;i<name.length();i++) 
		{
			c[i]= (char)(c[i]+32);
		}
		//printing converted string
		for(int i=0;i<name.length();i++) 
		{
			System.out.print(c[i]);
		}
		
	}

}
