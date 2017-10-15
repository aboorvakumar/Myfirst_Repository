package first.exciese;

public class Logic_Program15 
{
	/*static int minusone=-1;*/
	
	public static void main(String[] args)
	{
		
	
	/*{
		int N=minusone>>31;
		System.out.print("N:"+N);

	}*/
		Logic_Program15 program15=new Logic_Program15();
	 
		int Ans=program15.maskoff(5);
		System.out.print(Ans);
	}
	 public int maskoff(int n)
	{
		return n|3;
	}

}
