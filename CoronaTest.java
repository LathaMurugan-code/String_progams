package numbergame;
import java.io.*;
import java.util.*;
public class CoronaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
     String V = sc.next();
    Scanner sc1 = new Scanner(System.in);
	  int N = sc1.nextInt();
    Scanner sc2 = new Scanner(System.in);
	  String [] Bi = new String[N];
		 for(int i=0;i<N;i++)
		   {
		     Bi[i]=sc2.next();
		        }
		 for(int i=0;i<N;i++)
		 {
			 findResult(V,Bi[i]);
		 }
		        
	}
	public static void findResult(String s,String s2)
	{
		char []c = s.toCharArray();
		char []d = s2.toCharArray();
		int count=0;
		for(int j=0;j<d.length;j++) {
		for (int i=0;i<c.length;i++)
		{
			if(d[j]==c[i])
				count++;
			}
		}
		if(count==5)
			System.out.println("POSITIVE");
		else
		System.out.println("NEGATIVE");
				
	}

}
