package numberProgram;

public class fibbonacciSeriesUpto10Element 
{
	public static void main(String[] args)
	{
	int a=0;
	int b=1;
	int c;
	System.out.println(a);
	System.out.println(b);
	
	for(int i=3; i<=10; i++)  //to print series up to 1000 element
	{
		c=a+b;
		
		a=b;
		b=c;
		System.out.println(c);
	}
	}
}
