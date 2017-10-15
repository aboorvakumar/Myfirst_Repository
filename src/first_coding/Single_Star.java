package first_coding;

public class Single_Star 
{

	
	public static void main(String[] args) 
	{
		for(int rc=2; rc<=4; rc++)
		{
			for(int bc=1; bc<rc; bc++)
			{
				System.out.print(bc);
				System.out.print(" ");
			}
			System.out.println();
		}
		/*int rc=1;
		do{
			int bc=0;
			do{
				bc=bc+1;
				
						
			}while(bc<rc);
			rc=rc+1;
	
		
			System.out.println();
		}while(rc<4);*/
	}

}
