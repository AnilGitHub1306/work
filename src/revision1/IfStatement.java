package revision1;

public class IfStatement 
{
	public static void main(String[] args) 
{
	int age = 45;
	int weight = 65;
	
	if(age >= 18) //--> outer
	{
	//cond-true
	System.out.println("go for weight check");
	if(weight >= 50) //--> inner
	{
	//cond -true
	System.out.println("Donate the blood");
	}
	else
	{ 
	//cond-false
	System.out.println("cant donate the blood ,weight criteria");
	}
	}
	else
	{
	//cond-false
	System.out.println("not eligible , due to age criteria");
	}
	}
	}
