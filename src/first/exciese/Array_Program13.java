package first.exciese;

public class Array_Program13 
{

	
	private static int N;;
	public static void main(String[] args)
	{
	//	char[] c=new char[3];
		//System.out.print(c);
		Array_Program13 program13=new Array_Program13();
	
		int Ans=program13.adder(N);
		
		System.out.print(Ans);
	}
	public int adder(int N)
	{
		return 0x100+ N++;
	}

}
