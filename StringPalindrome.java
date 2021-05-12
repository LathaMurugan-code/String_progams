package babe;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindrome p = new StringPalindrome();
		p.palindromeCheck("malayalam");

	}
	public void palindromeCheck(String s)
	{
		char [] a = s.toCharArray();
		char [] b = new char[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		//System.out.println(String.valueOf(b));
		int count=0;
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==b[i])
				count++;
		}
		if(count==a.length)
		{
			System.out.println("String Palindrome");
		}
		else
			System.out.println("not a String palindrome");
		
		
	}
    

}
