//2) Java Program to count the total number of vowels and consonants in a string

package String;
public class Count_The_Ovel_And_Consonent
{
	public static void main(String[] args)
	{
		String x="avbenmidfohjukl";	
		int temp=0;
		int max=0;
		for(int i=0; i<=x.length()-1;i++)
		{ 
			if (x.charAt(i)=='a'||x.charAt(i)=='e'||
				x.charAt(i)=='o'||x.charAt(i)=='i'||x.charAt(i)=='u')
			{temp++;}
			else
			{max++;}
		}	
		System.out.println("Total ovels in string are : "+ temp);
		System.out.println("Total consonents in string are : "+max);
	}
}
