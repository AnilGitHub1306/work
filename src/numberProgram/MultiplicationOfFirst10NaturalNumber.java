//Java Program to Find multiplication of first 10 Natural Numbers. 

package numberProgram;
public class MultiplicationOfFirst10NaturalNumber 
{
	public static void main(String[] args)
	{
		int multi=1;
		
		for(int i=1; i<=10; i++)
		{ 	
			multi=multi*i;
		}
		
		System.out.println(multi);
	}
}
