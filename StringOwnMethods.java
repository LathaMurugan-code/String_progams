package babe;

public class StringOwnMethods {
		public static void main(String [] args)
		{
			StringOwnMethods obj = new StringOwnMethods();
			obj.findLength();
		}

		        //length
				public void findLength()
				{
			      String name = "payilagam";
				char c[]= name.toCharArray();
				
				int count = 1;
				int i= 0;
				while(c[i]>=0)
				{
					count++;
						i++;
						if(c[i]=='m')
							break;
				}
				System.out.println(count);
				}
}
