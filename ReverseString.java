package babe;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString r = new ReverseString();
		r.reverse("Latha");

	}
	public void reverse(String s)
	{
		char [] a = s.toCharArray();
		char [] b = new char[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		System.out.println(String.valueOf(b));
	}

}
