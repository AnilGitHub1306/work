package numberProgram;

public class PrimeNumberbetween1to100 
{
public static void main(String[] args) 
{	
	int x=100;
	for(int n=1;n<=x;n++)	
	{	int temp=0;
		for(int i=2; i<=n-1;i++)
		{
			if(n%i==0)
			{temp=temp+1;}
		}
		if(temp==0)
		{ System.out.println(n);}
	}
}
}
