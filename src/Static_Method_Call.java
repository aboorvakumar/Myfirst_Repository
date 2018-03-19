package learn.java.program;


public class Static_Method_Call 
{
	/*here i call static method without creating object*/
	/*public static void main(String[] args)
	{
		myMethod();

	}
	static void myMethod()
	{
		System.out.println("This is static method");
	}*/
	
	/*multiple static block*/
	/*static int id;
	static String name;
	static
	{
		System.out.println("static block 1");
		id=101;
		name="block1";
		
	}
	override the 2nd static block
	static
	{
		System.out.println("static block 2");
		id=102;
		name="block2";
	}
	public static void main(String[] args)
	{	
		System.out.println("The value of ID:"+id);
		System.out.println("The value of NAME:"+name);
		
	}*/
	/*static variable can be  accessed directly in static method*/
	/*static int var1=101;
	static String var2="ak";
	
	static void display()
	{
		System.out.println("var1 is:"+var1);
		System.out.println("var2 is:"+var2);
	}
	public static void main(String[] args)
	{
		display();
	}*/
	
	/*static variable are shared all the instance of class*/
	/*static int var1=50;
	String var2;
	public static void main(String[] args)
	{
	Static_Method_Call obj1=new Static_Method_Call();
	Static_Method_Call obj2=new Static_Method_Call();
	
	obj1.var1=100;
	obj1.var2="1 object";
	//System.out.println(var1);
	
	obj2.var1=200;
	obj2.var2="2 object";
	
		System.out.println("var1 is:"+obj1.var1);
		System.out.println("var2 is:"+obj1.var2);
		
		System.out.println("var1 is:"+obj2.var1);
		System.out.println("var2 is:"+obj2.var2);
	}*/
	
	/*static method accessed directly static and non-static methods */
	/*static int i=100;
	static String s="Java";
	
	static void display()
	{
		System.out.println("i:"+i);
		System.out.println("s:"+s);
	}
	void run()
	{
		display();
	}
	public static void main(String[] args)
	{
		Static_Method_Call obj=new Static_Method_Call();
		obj.run();
		display();
	}*/
	/*static class*/
	private static String s="java";
	
	static class Myclass
	{
		public void display()
		{
			System.out.println(s);
			
		}
	}
	public static void main(String[] args)
	{
		Static_Method_Call.Myclass obj=new Static_Method_Call.Myclass();
		obj.display();
	}
}

