package ArrayProgram;

import java.util.Arrays;

public class FindPrimenoInArray 
{
public static void main(String[] args) 
{
		int a[]= {37,67,45,35,};
		int temp=0;
		
		Arrays.sort(a);
		for(int i=0; i<a.length-1;i++)
		{
		for(int j=0; j<a[(a.length-1)];j++)
		{	
			if(a[i]%j==0)
			{temp++;}
		}}
		if(temp >0)
		{System.out.println(a+" is not aPrime No."+ a);}
	
		else 
		{System.out.println("prime no. is "+ a);
}
}
}hgfhd