package ArrayProgram;

public class SecondlargestNumber 
{
public static void main(String[] args) 
{
	int a[]= {111,222,335453,444,5455,6696};
	
	int max = a[0];
	int secondc = a[0];
	int x = a[0];
	
	for(int i=0 ; i<a.length ;i++)
	{
		if(a[i] > max)
		{
			x = max;
			max = a[i];
			secondc = x;
		}	
	}
	{	System.out.println(" largest Number is " +max);
		System.out.println("Second largest Number is " +secondc);}
}
}


























