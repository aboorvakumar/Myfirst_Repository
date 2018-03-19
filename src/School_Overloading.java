package learn.java.program;

public class School_Overloading
{

	 void calculater(int i, int j) 
	 {
		// int c=i+j;
		 System.out.print("The Total(i+j) is:");
		 System.out.println(i+j);
	 }

	void calculater() 
	{
		int a=2;
		int b=3;
		int c=a+b;
		 System.out.println("The Total is:"+c);
		
	}

	void calculater(int i, int j, int k, int l) 
	{
		 System.out.print("The Total(i+j+k+l) is:");
		 System.out.println(i+j+k+l);
		
	}

	

	public void calculater(int t, int e, int m, int s, int ss) 
	{
		System.out.print("Total is=");
		System.out.print(t+e+m+s+ss);
		
	}

	void calculater(Student_Overl stu) 
	{
		
		
	}


}
