package babe;

public class StringSeperate {
	static int k;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSeperate s = new StringSeperate();
        s.seperate("Latha Murugan",0);
	}

	public void seperate(String s,int i) {
		// TODO Auto-generated method stub
		char []a = s.toCharArray();
		if(i<a.length)
		{
		if(a[i]==' ')
		{
			print(s,i-1,0);
			System.out.println();
			print(s,a.length-1,i+1);
			
		}
		seperate(s,i+1);
		
		
		
		
		}
		
		
		
	}

	public void print(String s, int j,int k) {
		// TODO Auto-generated method stub
		char[]c =s.toCharArray();
		char[]p =new char[c.length];

		if(k<=j)
		{
            p[k]=c[k];
			System.out.print(p[k]);
			print(s,j,k+1);
		}
		
		
		}

}
