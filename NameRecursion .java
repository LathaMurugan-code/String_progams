package babe;

public class NameRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRecursion n = new NameRecursion();
		n.printName(0);

	}

	public void printName(int i) {
		// TODO Auto-generated method stub
		String s ="LathaMurugan";
		char c[]  = s.toCharArray();
		if(i<c.length)
		{
			System.out.println(c[i]);
			printName(i+1);
		}
		
		
	}

}
