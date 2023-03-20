package numberProgram;

public class fibbonacciSeriesupto10 
{
public static void main(String[] args) 
{
	int a=0;
	int b=1;
	int c;
	System.out.println(a);
	System.out.println(b);
	
	for(int i=2; i<=9; i++)  //How many element to be print
	{
		c=a+b;
	//	if(c<=103)             //Up to which no. to be print
	//	{
		a=b;
		b=c;
		System.out.println(c);
	//	}
	}
}
}
