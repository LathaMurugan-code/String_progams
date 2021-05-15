package babe;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortString d =new SortString();
		d.sort("maagash");

	}

	public void sort(String s) {
		// TODO Auto-generated method stub
		char c[] = s.toCharArray();
		char results[]=new char[c.length];
		for(int j=1;j<c.length;j++)
		{
		for(int i=0;i<c.length-j;i++)
		{
			if(c[i]>c[i+1])
			{
				 char temp = c[i];
				 c[i]=c[i+1];
				 c[i+1]=temp;
				}
		}
		System.out.println(String.valueOf(c));
		
	}
		}

}
