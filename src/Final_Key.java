
public class Final_Key  extends Show
{

	
	public static void main(String[] args) 
	{	/*final variable in java*/
		/*final int n=10;
		Display f=new Display();
		f.show();*/
		//Test1 t=new Test1();
		Final_Key f=new Final_Key();
		f.run();
		
	}

	
}
class Show
{/*inherited in final methods*/
	final void run()
	{
		System.out.println("hi");
	}
}
/*the final class*/
//final class show
/*class Show
{final method in java
	public  void show()
	{
		System.out.println("hi");
	}
}
class Display extends Show
{	
	public void show()
	{
		System.out.println("hello");
	}
}*/

/*class Test1
{
	
	static final int num;
	constructors
	//Test1(int i)
	static
	{
		num=100;
		System.out.println(num);
	}
	

}
	*/

