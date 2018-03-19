
public class Indian_Exception 
{

	
	public static void main(String[] args) 
	{
		int age=15;
		VoterId_Exception vote=new VoterId_Exception();
		try{
		vote.verifyAge(age);
		}catch(VoterId_Exception vie)
		{
			
				System.out.print("Check Age");
			
		}

	}

}
