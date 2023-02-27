package String;

public class findOvelsinString 
{
	public static void main(String[] args)
	{
		String x="avbenmidfeohjbkcfgdsCLBFDAXHVZFSEOACVACukul";	
		int temp= 0;
		for(int i=0; i<=x.length()-1;i++)
		{  
			if (x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='o'||x.charAt(i)=='i'||x.charAt(i)=='u' 
				||x.charAt(i)=='A'||x.charAt(i)=='E'||x.charAt(i)=='O'||x.charAt(i)=='I'||x.charAt(i)=='U' )
			{
				System.out.println( x.charAt(i)); // print the ovals
				{temp=temp+1;}
			} 
		}	
		
		System.out.println("Ovels in string are: " + temp);
	}
}
