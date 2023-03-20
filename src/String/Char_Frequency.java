package String;

public class Char_Frequency
{
	public static void main(String[] args)
	{
		String x="rahula";
		char ch ='a';
		
		int max=0;
			for(int j=0; j<= x.length()-1;j++)
			{
				if(ch==x.charAt(j))
				{max++;}	
			}
			System.out.print(max);	
	}	
}
