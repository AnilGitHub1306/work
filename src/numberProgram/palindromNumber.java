package numberProgram;
public class palindromNumber 
{
public static void main(String[] args)
{
	int number=151;
	int temp=number;
	int rem=0;
	int rev=0;
	
	while(number>0) 
	{
		rem=number%10;
		rev=rev*10+rem;
		number=number/10;
	}
	if(temp == rev)
	{
		System.out.println(temp + " is palindrom number");
	}
	else
	{System.out.println(temp + " is not a palindrom number");}
}
}
