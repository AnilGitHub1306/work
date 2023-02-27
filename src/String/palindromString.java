package String;

public class palindromString 
{
	public static void main(String[] args)
	{
		
		String a="saas";
		String revers ;
		for(int i=a.length()-1;i>=0;i--)
		{
		String	revers1=revers1+a.charAt(i);
			if(a.equals(a.charAt(i)))
			{
				System.out.print(  a.charAt(i) );
			//	System.out.print( "String is revers as "+ (a.charAt(i)) );
			}
		}
	}
}
