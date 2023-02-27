package numberProgram;

public class amstrongNumberfrom1to1000 
{
	public static void main(String[] args) 
	{
		for(int number=1;number<=1000;number++)
		{
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
		System.out.println(number + " It is amstrong");
		}
		else 
		{
		System.out.println(number +" It is not a amstrong");
		}
		}
	}
}
