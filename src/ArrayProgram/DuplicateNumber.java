package ArrayProgram;

public class DuplicateNumber 
{
public static void main(String[] args) 
{
	int a[]  = {1,6,8,9,1,5,9,4,5};
	
	System.out.println("duplicate no. are = ");
	
	for(int i=0; i<a.length ; i++)
	{
		for(int j=i+1; j<a.length ; j++)
		{
			if((a[i] == a[j]) )
			{System.out.println(a[i]);}
		}
	}
}
}
