package babe;

public class OverrideInbuiltMethods {
int id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideInbuiltMethods s = new OverrideInbuiltMethods();
		s.id=01;
		System.out.println(s);
		System.out.println(s.hashcode());
		/*output
		 * babe.OverrideInbuiltMethods@4517d9a3
		 * Package_name.class_name@hashcode
		 */
		String l = new String();
		System.out.println(l);
		//no output
		OverrideInbuiltMethods r = new OverrideInbuiltMethods();
		r.id=01;
		if(s.equals(r))
		{
			System.out.println("objects equal");
		}
		else
		{
			System.out.println("not equal");
		}
		}
	public String toString()
	{
		return "hi_Babe";
	}
	//this method overrides inbuilt toString method
	public int hashcode()
	{
		return 123;
	}
	//this method overrides inbuilt hashcode method
	public boolean equals(Object ob)
	{
		OverrideInbuiltMethods p = (OverrideInbuiltMethods)ob;
		if(this.id==p.id)
			return true;
		else
			return false;
	
	}
}
