package first.exciese;

public class Test_Program25
{

	
	public static void main(String[] args) 
	{
		try
		{
			boolean x=true;
			boolean y=false;
			System.out.println((x&y) + " " + (x&x));
			System.out.println(" ");
			System.out.print((x^y) + " " + (x^x) + " " + (y^y));
			System.out.println(" ");
			System.out.print((x|y) + " " + (x|x) + " " + (y|y));
		}catch(Exception e)
		{
			System.out.println("Exception thrown");
			
		}

	}

}
