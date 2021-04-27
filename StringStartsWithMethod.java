package babe;

public class StringStartsWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStartsWithMethod word = new StringStartsWithMethod();
		System.out.println(word.findStartchar());
		
		}
	public boolean findStartchar()
	{
	String sent = "Stay aware maintain distance";
	String start= "Stay";
	int count=0;
	for(int i=0;i<start.length();i++)
	{
		if (sent.charAt(i)==start.charAt(i))
		{
			count++;
		}
	}
	if(count==start.length())
		return true;
	return false;
	}

}
