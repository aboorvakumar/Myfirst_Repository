package learn.java.program;


public class Thread_Main 
{

	
	public static void main(String[] args) 
	{
		Display d1=new Display("periyar");
		Display d2=new Display("kamaraj");
		String greeting="hbd";
		MyThread mt1=new MyThread(d1,greeting);
		mt1.start();
	/*	MyThread mt2=new MyThread(d2,greeting);
		mt2.start();*/

	}

}

class MyThread extends Thread
{
	Display d1;
	String g;
	public MyThread(Display d1, String greeting)
	{
		this.d1=d1;
		g=greeting;
	}
	public void run()
	{
		d1.display(d1,g);
	}
	
}

class Display
{
	String s;
	public Display(String string) 
	{
		this.s=string;
	}
	public void display(Display d1, String g) 
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(d1.s);
			System.out.println(g);
		}
		
	}
	
	
}
