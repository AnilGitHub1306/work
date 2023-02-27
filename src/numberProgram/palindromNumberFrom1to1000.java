package numberProgram;

public class palindromNumberFrom1to1000 
{
public static void main(String[] args)
{
	for(int number=1;number<=1000;number++)
	{
	int temp=number;
	int rem=0;
	int rev=0;
	
	while(temp>0) 
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	
	if(number == rev)
	{
		System.out.println(number + " is palindrom number");
	}
//	else
//	{System.out.println(number + " is not a palindrom number");}
	}
	}
}
