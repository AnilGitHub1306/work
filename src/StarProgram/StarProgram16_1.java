package StarProgram;
public class StarProgram16_1 
{
public static void main(String[] args)
{
	for(int i=1;i<=5;i++)
	{
		for(int m=4;m>=i;m--)
		{System.out.print(" ");}
		
		for(int n=1;n<=i;n++)
		{System.out.print("*");}
		
		for(int o=2;o<=i;o++)
		{System.out.print("*");}
		
		System.out.println("");
	}
	for(int i=1;i<=4;i++)
	{
		for(int n=1;n<=i;n++)
		{System.out.print(" ");}
		
		for(int m=4;m>=i;m--)
		{System.out.print("*");}
		
		for(int m=3;m>=i;m--)
		{System.out.print("*");}
		
		System.out.println("");
	}
}
}
