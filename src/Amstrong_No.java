package learn.java.program;

import java.util.Scanner;


public class Amstrong_No
{

	
	public static void main(String[] args) 
	{
		
		int sum=0;
		System.out.print("Enter the No");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=x;
		while(n>0)
		{
			int d=n%10;
			sum=(d*d*d)+sum;
			n=n/10;
		}
		if(x==sum)
		{
			System.out.print("This is Amstrong No:"+sum);
		}
		else
		{
			System.out.print("This is not Amstrong No");
		}
	}

}
