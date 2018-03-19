
public class Exception1 
{

	public static void main(String[] args) 
	{
		Abc abc=new Abc();
		try{
		abc.doTest();
		}catch(ArithmeticException ae)
		{
			System.out.print("Arith");
		}
	}

}
