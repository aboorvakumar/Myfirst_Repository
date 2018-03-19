package learn.java.program;

/*1.To create  abstraction class before the class add (abstract class class_name).
	  2.To create abstract method add (abstract data_type method_name ).
	  3.The abstract methods should be incomplete.
	  4.Then class1 extends abstract_class.
	  5.The abstract_class should be complete the main class.
 */
class Abstraction extends Test
{

	 public static void main(String[] args) 
	 {
		 Abstraction a=new Abstraction();
		 a.run();
		 a.print();
		 a.write();
		 a.read();
	}
	 @Override
	 void run()
	 {
		 System.out.println("This is Abstraction methods");
	 }
	@Override
	void print() 
	{
		
		System.out.println("print");
		
	}
	@Override
	void write()
	{
		System.out.println("write");
	}
	void read()
	{
		System.out.print("Read");
	}
}	
abstract class  Test
{
	 	abstract void run();
		abstract void print();
		abstract void write();
		/*void print()
		{
			System.out.println("This is non abstract method");
		}*/
}

