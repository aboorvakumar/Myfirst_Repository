
import java.util.Arrays;
import java.util.Scanner;


public class Duplicate_No 
{

	
	public static void main(String[] args)
	{
		/*Scanner s=new Scanner(System.in);
		System.out.print("Enter the N:");
		int n=s.nextInt();
		int[] array=new int[n];*/
		int []array={1,2,3,4,3,1};
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i]==array[j])
				{
					System.out.println("Duplicate array:"+array[i]);
				}
			}
			
		}
		//System.out.println("NO Duplicate Value found");

	}

}
