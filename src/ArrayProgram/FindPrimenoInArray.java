package ArrayProgram;

public class FindPrimenoInArray 
{
public static void main(String[] args) 
{
		int a[]= {37,67,45,35,};
		int temp=0;
		for(int i=0; i<=360;i++)
		{	
		if(a/i==0)
		{
			temp=temp+i;	
		}
		
		}
		if(temp >0)
		{System.out.println("Prime No. is "+ a);}
	
		else 
		{System.out.println("Not a prime no."+ a);
}
}
}