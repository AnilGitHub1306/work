package numberProgram;

public class findGCDOfTwoNumber 
{
//	public static void main(String[] args) 
	
//----------------Using For Loop------------------------------------	
	
//	{
//		int x = 28;
//		int y = 20;
//		int GCD=1;
//		for(int i=1; i<=20;i++)
//		{
//			if(x%i==0 && y%i==0)
//			{GCD=i;}	
//		}
//	System.out.println("GCD of " +x+", " + y + " is-> " + GCD);
//	}	
//}
//----------------Using while Loop----------------------------------		
//	{  
//		int a=28, b=20;  
//		while(a!=b)   
//		{  
//		if(a>b)  
//		a=a-b;  
//		else  
//		b=b-a;  
//		}  
//		System.out.printf("GCD of a and b is: " + b);  
//		}  }
	
	
public static void main(String[] args)
{
	int a=40;
	int b=24;
	
	int GCD=1;
	
	if(a>b)
	{
		for(int i=1; i<a;i++)
		{	
			if(a%i==0 && b%i==0)
			{GCD=i;}
		}
	System.out.println("GCD of "+a+" "+b+ " is: "+GCD);
	}
	else if(b>a) 
	{
		for(int i=1; i<b;i++)
		{	
			if(a%i==0 && b%i==0)
			{GCD=i;}
		}
		System.out.println("GCD of "+a+" "+b+ " is: "+GCD);
		}
	else
	{System.out.println("GCD of "+a+" "+b+ " is: "+a);}
}
}