package babe;

public class StringEndsWithMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringEndsWithMethod word = new StringEndsWithMethod();
		System.out.println(word.findStartchar());
		
		}
	public boolean findStartchar()
	{
	String sent = "Stay aware maintain distance";
	String end= "distance";
	int count=0;
	int j= sent.indexOf("d");
	for(int i=0;i<end.length();i++)
	{
		if (sent.charAt(j)==end.charAt(i))
		{
			count++;
		}
		j++;
	}
	if(count==end.length())
		return true;
	return false;
	}

}



