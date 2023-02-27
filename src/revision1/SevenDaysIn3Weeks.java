// Write a program to print 7 days in 3 weeks.
package revision1;

public class SevenDaysIn3Weeks 
{
	public static void main(String[] args)
	{
		for(int i=1; i<=3; i++)
		{ System.out.println("Week " + i);
		
			for(int j=1; j<=7; j++)
			{System.out.print("Day"+j+" ");}
		
		 System.out.println();
		}
	}
}
