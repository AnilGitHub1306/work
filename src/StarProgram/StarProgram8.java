package StarProgram;

public class StarProgram8 
{
public static void main(String[] args) 
{
	for(int i=1; i<=5; i++)
	{
		for(int j=4; j>=i; j--)
		{System.out.print(" ");}
		
		for(int m=1; m<=i; m++)
		{System.out.print("*");}
		
		{System.out.println(" ");}
	}
	
	for(int k=1; k<=5;k++)
	{
		for(int l=1;l<=k;l++)
		{System.out.print(" ");}
		
		for(int n=4; n>=k; n--)
		{System.out.print("*");}
		
		{System.out.println(" ");}
	}
}
}
