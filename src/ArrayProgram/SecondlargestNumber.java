package ArrayProgram;

import java.util.Arrays;

public class SecondlargestNumber 
{
public static void main(String[] args) 
{
	int a[]= {1,4,3,6,7,5,8,2,89,9,56};
	int temp=0;
	Arrays.sort(a);
	System.out.println(a[(a.length-2)]);
}
}

























