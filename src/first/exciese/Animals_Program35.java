package first.exciese;

public class Animals_Program35 
{

	

	public static void main(String[] args) 
	{
		boolean donkey=false;
		boolean rabbit=true;
		boolean leporidae=true;
		if(rabbit&donkey | donkey&leporidae | donkey)
		{
			System.out.println("DOG");
		}
		if(rabbit&donkey | donkey&leporidae | donkey | rabbit)
		{
			System.out.println("CAT");
		}
	}

}
