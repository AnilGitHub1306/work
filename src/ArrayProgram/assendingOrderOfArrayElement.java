package ArrayProgram;

import java.util.Arrays;

	public class assendingOrderOfArrayElement 
	{
		public static void main(String[] args) 
	
	//	{
	//		int a[]  = {4,6,2,9,7,8,3,5};
	//		
	//		
	//		int temp=0;
	//		for(int i=0; i<a.length-1 ; i++)
	//		{
	//			for(int j=i+1; j<a.length ; j++)
	//			{
	//				if((a[i] < a[j]) )
	//				{
	//					dsfdsfd
	//					temp++;
	//				}
	//			}
	//			if(temp>0)
	//			{System.out.println(a[i]);}
	//		}
	//	}
	//}
	{
			int a[]  = {4,6,2,9,7,8,3,5};
			
			Arrays.sort(a);
			
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			
			
	}
	}