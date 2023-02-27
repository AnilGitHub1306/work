package String;

public class Char_Frequency
{
	public static void main(String[] args)
	{
		String x="rahula";
	
		for(int i=0; i <x.length();i++)
		{int max=1;
			for(int j=i+1; j<= x.length()-1;j++)
			{
				if(x.charAt(i)==x.charAt(j))
				{max++;}
			}
			System.out.print(max);
			System.out.println(x.charAt(i));
		}
	}
}fssdsdas
