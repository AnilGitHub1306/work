package ArrayProgram;

import java.util.Arrays;

public class arrayasendingorder 
{
public static void main(String[] args) 
//{
//	int a[]= {4,2,8,6,3,5,0,9,7,1};
//	int b = a[0];
//	{
//		for(int i=0 ; i<=a.length-1 ; i++)
//		{
//			for(int j=0 ; j<=a.length-1 ; j++) 
//			{
//				if(a[j] > a[j+1])
//				{
//					a[j] = b;
//					a[j] = a[j+1];
//					a[j+1] = b;
//				}	
//			}
//		
//		}
//		for(int j=0 ; j<=a.length-1 ; j++)
//			{System.out.println(a[i]);}
//	}
//}
{
	int a[]  = {4,6,2,9,7,8,3,5};

	Arrays.sort(a);
	reverse(a);
	System.out.println(Arrays.toString(a));
	
}

private static void reverse(int[] a) {
	// TODO Auto-generated method stub
	
}


	
	




}
