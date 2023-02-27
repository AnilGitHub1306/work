// Java Program for Factorial of any number. Ex. 5!, 9!

package numberProgram;

public class FactorialOfAnyNumber
{
	public static void main(String[] args)
	{
		int x=10;
		int Factorial=1;
		
		for(int i=1; i<=5; i++)
		{ 	
			Factorial=Factorial*i;
		}
		
		System.out.println(Factorial);
	}
}
//          OR
	

//	{
//		int Factorial=1;
//		
//		for(int i=9; i>=1; i--)
//		{ 	
//			Factorial=Factorial*i;
//		}
//		
//		System.out.println(Factorial);
//	}
//}
