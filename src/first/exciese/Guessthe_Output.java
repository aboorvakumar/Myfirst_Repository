package first.exciese;
//import first_coding.*;

public class Guessthe_Output 
{

	private static int output;

	public static void main(String[] args) 
	{
		output = 10;
		boolean b1=false;
		if((b1==true)&&((output+=10)==20))
		{
			System.out.print("We are equal" + output);
			
		}
		else
		{
			System.out.print("Not equal!" + output);
		}
		

	}

}
