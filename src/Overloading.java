package learn.java.program;


public class Overloading 
{
	int a,b,c;
	public static void main(String[] args) 
	{
		Overloading over=new Overloading();
		over.add();
		over.add(5,5,5);

	}

	private void add() 
	{
		 a=5;
		 b=5;
		 c=a+b;
		System.out.println(c);
	}
	
	private void add(int x,int y,int z)
	{
		/* a=x;
		 b=y; 
		 c=z;*/
		 System.out.println(x+y+z);
		
	}
	
	

}
