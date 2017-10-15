package first_coding;

import java.util.Scanner;

public class First_Program
{
	
	
	public static int total;
	public int percentage;
	public static void main(String[] args) 
	{
	
	//	System.out.print("This is me:"+"I very Happy");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Tamil Mark:");
		int a=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter English Mark:"  );
		int b=sc1.nextInt();
		Scanner sc11=new Scanner(System.in);
		System.out.print("Enter Maths Mark:" );
		int c=sc11.nextInt();
		Scanner science=new Scanner(System.in);
		System.out.print("Enter Science Mark:" );
		int d=science.nextInt();
		Scanner sscience=new Scanner(System.in);
		System.out.print("Enter SS Mark:" );
		int e=sc.nextInt();
		First_Program first=new First_Program();
		total = first.add(a,b,c,d,e);
		System.out.print("The total value is:" + total);
		int ans=first.sub();
		int answer=first.multiple();
		int test=first.add();
		
		float percentage=first.percentage();
		System.out.println();
		System.out.print("The Everage is:"+percentage);
		System.out.println();
		System.out.println();
		System.out.print("The Addition  of :"+ test);
		System.out.print("The Subtration of :"+ ans);
		System.out.println();
		System.out.print("The Multiplecation of :"+ answer);
		
		
	}
	/*protected method*/
	protected int multiple() 
	{
		int xx=5;
		int yy=5;
		int zz=xx*yy;
		return zz;
		
	}
	/*protected method*/
	private int sub() 
	{
		int x=5;
		int y=10;
		int e=x-y;
	//	System.out.println();
		//System.out.print("This is subtration:"+ e);
		return e;
	}

	public float percentage() 
	{
	
	return percentage = total/5;	
		
	}

	  
		
	int add() 
	{
		int a=5;
		int b=10;
		int c=a+b;
		return c;
		
	}
	protected int add(int a, int b, int c, int d, int e) 
	{
		int f=a+b+c+d+e;
		return f;
	}
	

}
