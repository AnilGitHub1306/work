package StarProgram;

public class a12 
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5;i++)
		{
			for(int m=4;m>=i;m--)
			{System.out.print("-");}
			
			for(int n=1;n<=i;n++)
			{System.out.print("*");}
			
			for(int p=2;p<=i;i++)
			{System.out.print("*");}
			
			System.out.println("");
		}
	}

}
