package String;

public class ReversStringWordByWord 
{
public static void main(String[] args)
{
	String name="My Name Is Anil";

	String newName[]=name.split(" ");
	
	for(int i=newName.length-1;i>=0;i--)
	{
		System.out.print(newName[i] + " ");	
	}
}
}
