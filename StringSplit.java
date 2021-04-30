package babe;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tosplit = "06/06/2021";
		String[] result = tosplit.split("/");
		for(String s:result)
		{
			System.out.println(s);
		}
		
  }
	//perform split function
	public void performSplit(String s)
	{
		
		char c[]= s.toCharArray();
		String [] result;
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(c[i]!= '/')
			{ 
				String v =String.valueOf(c);
				
			}
			else
			result[j]= v;
					
		
		
	}

}
