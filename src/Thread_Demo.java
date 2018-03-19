package learn.java.program;

import java.security.AccessControlContext;

//import sun.invoke.empty.Empty;


/*class MyThread extends Thread
{
	
	


	public void run()
	{
		//Thread.yield();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) 
		{
			System.out.println("hi");
			e.printStackTrace();
		}
		for(int i=0; i<5; i++)
		{
			System.out.println("hi");
		}
		
	}

*/
//}
class Thread_Demo
{
	public static void main(String[] args) //throws InterruptedException
	{
		
		//mt1.start();
		
		/*MyThread mt=new MyThread();
		mt.start();
		System.out.println(mt.getPriority());
		mt.setPriority(10);
		System.out.println(mt.getPriority());
		//mt.set
		
		
	
		for(int i=0; i<5; i++)
		{
			System.out.println("hello");
		}*/
		Sathees sathees=new Sathees();
		sathees.start();
		try {
			sathees.join();
		} catch (InterruptedException e1) {
			System.out.println("hello");
			e1.printStackTrace();
		}
		Thread_Demo m=new Thread_Demo();
		m.printInvitation();
		try {
			m.wait(5000);
		} catch (InterruptedException e) {
			System.out.println("hi");
			e.printStackTrace();
		}
	}

	synchronized void printInvitation() 
	{
		System.out.println("Invitation");
		
	}
}
/*join method in thread*/
class Sathees extends Thread
{
	synchronized public void run()
	{
		bookFunctionHall();
	}

	 synchronized public  void bookFunctionHall() 
	{
		System.out.println("Booked");
		
	}
}
