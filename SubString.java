package babe;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubString s = new SubString();
		s.checkSubstring("Queensland","land");

	}

	public void checkSubstring(String s, String s2) {
		// TODO Auto-generated method stub
		int count=0;
		int n =0;
		
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==s2.charAt(0))
				{
				 for(int k=j;k<s.length();k++)
				 {
					 if(s.charAt(k)==s2.charAt(n))
					 {
						 count++;
						 n++;
					 }
				 }
				}
			}
				 if(count==s2.length())
					 System.out.println("substring");
				 else
					 System.out.println("not substring");
				
				}

}
