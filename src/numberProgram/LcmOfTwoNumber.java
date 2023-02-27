package numberProgram;

public class LcmOfTwoNumber
{
public static void main(String[] args)
{
	{
		int a = 2;
		int b = 25;
		int GCD=1;
		for(int i=1; i<=20;i++)
		{
			if(a%i==0 && b%i==0)
			{
				GCD=i;
			}
		}
		
		int LCM=a*b/GCD;
		
		System.out.println("LCM of "+ a +" , " + b + " is -> " + LCM);
	}	
}
}






















