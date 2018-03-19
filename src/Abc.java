package learn.java.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;




public class Abc 
{

	
	public static void main(String[] args) throws FileNotFoundException  
	{
		Abc a=new Abc();
		a.doTest();
		
		
		/*
		try{
			int[] a=new int[3];
			for(int i=0; i<5; i++)
			{
				a[i]=5;
			}
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please check");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Enter the b:");
		}*/
		/*finally
		{
			System.out.println("f");
		}*/
		
		File f=new File("test.txt");
		FileInputStream fis=new FileInputStream(f);
		

	}
	
	public void doTest() //throws ArithmeticException
	{
	
		int a=5;
		int b=0;
		System.out.print(a/b);
		throw new ArithmeticException();
	}

}
