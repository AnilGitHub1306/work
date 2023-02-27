package ArrayProgram;

public class CopyArrayElementInOtherArray 
{
	public static void main(String[] args)
	{
//		int a [] = {11,12,13,14,15};
//		int x= a.length;
//		int b[] = new int[x];
//		
//		for(int i=0; i<b.length; i++)
//		{
//			b[i] = a[i];
//			System.out.println(b[i]);
//		}
//	}
//}	
//********************************************************		
	int a [] = {11,12,13,14,15};
	int x= a.length;
	int b[] = new int[x];
		b[0] = a[0];
	    b[1] = a[1];
		b[2] = a[2];
		b[3] = a[3];
		b[4] = a[4];
		
		for(int i=0; i<b.length; i++)
		{
			
			System.out.println(b[i]);
		}	
	}
}
