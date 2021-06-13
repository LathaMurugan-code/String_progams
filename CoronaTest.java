package numbergame;
import java.io.*;
import java.util.HashSet;
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
		HashSet<Character> h = new HashSet<Character>();
		for(int k=0;k<c.length;k++)
		{
		   h.add(c[k]);	
			}
		char []d = s2.toCharArray();
		HashSet<Character> h2 = new HashSet<Character>();
		for(int k=0;k<d.length;k++)
		{
		   h2.add(d[k]);	
			}
		
		if(h.containsAll(h2))
			System.out.println("POSITIVE");
		else
		System.out.println("NEGATIVE");
				
	}

}
