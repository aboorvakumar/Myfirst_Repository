package learn.java.program;

import java.util.Scanner;


public class Betveen_PrimeNo 
{

	public static void main(String[] args)
	{
		//int p=0,t;
		System.out.print("Enter the No:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=2; i<=n; i++)
		{
			Boolean f=false;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					f=true;
					break;
					//
				}
			}if(!f)
			{
				System.out.println(i);
			}
			
		}	
	
		

	}
}