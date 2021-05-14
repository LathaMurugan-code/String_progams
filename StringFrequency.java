package babe;

public class StringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFrequency s = new StringFrequency();
		s.findFreq("nothing comes easy");

	}

	public void findFreq(String s) {
		// TODO Auto-generated method stub
		char []a = s.toCharArray();
		int []freq = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			char c = a[i];
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(c==a[j])
				{   
					count++;
					freq[j]=-1;
				}
			}
			if(freq[i]!=-1)
				freq[i]=count;
			}
		for(int i=0;i<a.length;i++)
		{
			if(freq[i]>0)
			System.out.println(a[i]+" is repeated "+freq[i]+" times");
		}
		
	}

}
