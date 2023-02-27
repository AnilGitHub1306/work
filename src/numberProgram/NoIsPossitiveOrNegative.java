package numberProgram;

public class NoIsPossitiveOrNegative

{
	public static void main(String[] args)
	{
       int a=67;
       int b=50;
		
		if(a>0 && b>0)
			
		{System.out.println(" a & b is +ve");}
		
		else if (a<0 && b<0)
		{System.out.println("a & b is -ve");}
		
		else if (a>0 && b<0)
		{System.out.println("a is +ve and b is -ve");}
		
		else if (a<0 && b>0)
		{System.out.println("a is -ve and b is +ve");}
		
	}

}
