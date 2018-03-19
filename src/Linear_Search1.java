import java.util.Scanner;


public class Linear_Search1 
{

	
	public static void main(String[] args)
	{
		int[] month={1,2,3,4,5,6,7,8,9,10,11,12};
	
		System.out.print("Enter the month No:");
		Scanner sc=new  Scanner(System.in);
		int find=sc.nextInt();
		
		
		for(int i=0; i<month.length; i++)
		{
			if(find==month[i])
			{
				System.out.println("Your b'day month is:"+month[i]);
				
			}
		}
		
		System.out.println("Try again");
		
		
	}

}
