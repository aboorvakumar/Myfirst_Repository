import java.util.Scanner;


public class prime_NO
{

	
	public static void main(String[] args) 
	{
		
		int temp = 0;
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No: ");
		int a=sc.nextInt();
		if(a==0 || a==1)
		{
			temp=0;
		}
		for(int i=2; i<a; i++)
		{
			k=a%i;
			if(k==0)
			{
				temp=0;
				//break;
			}
			else 
			{
				temp=1;
			}
		
		if(temp==0)
		{
			System.out.print("not prime");
			break;
		}
		else
		{	
			System.out.print("Prime No");
			break;
			
		}
		
		}
	
	}
}




