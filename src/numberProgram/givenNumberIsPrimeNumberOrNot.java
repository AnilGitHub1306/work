package numberProgram;

public class givenNumberIsPrimeNumberOrNot
{
public static void main(String[] args) 
{
	int n =29;
	int temp=0;
	
	for(int i=2; i<n;i++)
	{
		if(n%i==0)
		{temp++;}
	}
	
	if(temp>0)
	{System.out.println(n+" is not prime number.");}
	else
	{System.out.println(n+" is  prime number.");	}
}
}