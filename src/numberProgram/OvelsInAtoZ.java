package numberProgram;
public class OvelsInAtoZ
{
	public static void main(String[] args)      //a e i o u	
	{
		for(char xy='a';xy<='z'; xy++)
		{
			if (xy=='a' && xy=='A' || xy=='e' && xy=='E'||
				xy=='i' && xy=='I' || xy=='o' && xy=='O'|| xy=='u' && xy=='U' )
			{
			System.out.println(xy+" is ovel" );
			}
			else 
			{
			System.out.println(xy+" is consonant");
			}
		}
	}
}
