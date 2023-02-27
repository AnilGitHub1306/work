package numberProgram;

public class amstrongNumber 
{
	public static void main(String[] args) 
	{
		int number=153;
		int rem=0,rev=0;
		int temp=number;
		while(temp>0) 
		{
		rem=temp%10;
		rev=(rem*rem*rem)+rev;
		temp=temp/10;
		}
		if(number==rev) 
		{
		System.out.println("It is amstrong");
		}
		else 
		{
		System.out.println("It is not a amstrong");
		}
	}
}