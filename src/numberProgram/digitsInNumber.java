package numberProgram;
public class digitsInNumber 
{
public static void main(String[] args)
{
	int number =364824534;
	int i =0;
	
	while(number>0)
	{
		number=number/10;
		i++;
	}
	System.out.println("no. of digits in number is "+ i);
}
}
