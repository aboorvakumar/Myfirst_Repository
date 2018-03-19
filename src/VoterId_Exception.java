package learn.java.program;


public class VoterId_Exception extends Exception
{

	public void verifyAge(int age) throws VoterId_Exception
	{
		
			if(age<18)
			{
				//System.out.print("ok");
				throw new VoterId_Exception();
			}
			
				
		
	}
	


}
