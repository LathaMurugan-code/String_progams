package babe;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringAnagram a = new StringAnagram();
		a.anagram("mango", "mango");

	}
	public void anagram(String a, String b)
	{
		char []c = a.toCharArray();
		char []d = b.toCharArray();
		int count =0;
		for(int i=0;i<a.length();i++)
		{    
			if(c.length==d.length)
			for(int j=0;j<b.length();j++)
			{
				if(c[i]==d[j])
					count++;
					
			}
		}
		if (count==c.length)
			System.out.println("String Anagram");
		else
		{
			System.out.println("not an Anagram");
		}
	}

}
