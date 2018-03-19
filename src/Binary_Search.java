package learn.java.program;

import java.util.Scanner;


public class Binary_Search 
{

	
	public static void main(String[] args) 
	{
		int counter, num, item, array[], first, last, middle;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		num=input.nextInt();
		//array to store all the elements 
		array =new int[num];
		System.out.println("Enter"+num+"integer");
		for(counter=0; counter<num; counter++)
		{
			array[counter]=input.nextInt();
			System.out.println("Enter the search item:");
			item=input.nextInt();
			first=0;
			last=num-1;
			middle=(first+last)/2;
			while(first<=last)
			{
				if(array[middle]<item)
					first=middle+1;
				else if (array[middle]==item)
				{
					System.out.println(item+"fount at location"+(middle+1)+".");
					break;
				}
				else
				{
					last=middle-1;
				}
				middle=(first+last)/2;
			}
			if(first>last)
			{
				System.out.println(item+"is not fount");
			}
		}
	}

}
