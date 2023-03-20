package numberProgram;

public class PerfectSquare 
{
public static void main(String[] args)
{
	int x=9;
	int p=0;
	for(int i=1;i<=(x/2);i++)
	{
		if(i*i == x)
		{System.out.println(x+ " is perfect square of "+i );}
		else
		{p++;}			
	}
	if(p>0)
	{System.out.println(x+ " is not a perfect square " );}	
}
}

//	if(x>=0)
//	{
//		int y=(int)Math.sqrt(x);
//		System.out.println(y);
//	}
//	}}
	
	
	


