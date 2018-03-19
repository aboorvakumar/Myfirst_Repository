package learn.java.program;


public class Array_Search
{

	
	public static void main(String[] args)
	{
		char find='e';
		char[] alpha={'a','d','c','b','e'};
		for(int i=0; i<alpha.length; i++)
		{	
			if(find == 'a'|| find == 'd'|| find == 'c'|| find == 'b'|| find == 'e')
			{
				System.out.println("E is Avaliable");
			//	break;
			}
			else
			{
				System.out.println("E is not Avaliable");
				
			}break;
			
		}
	}

}
