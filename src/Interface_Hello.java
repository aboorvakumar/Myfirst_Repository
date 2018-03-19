/*Interface implement morethen one interface*/
interface A
{
	int x=10;
}
interface B
{
	int x=100;
}
public class Interface_Hello implements A,B
{

	
	public static void main(String[] args) 
	{
		//System.out.println(x);
		System.out.println(A.x);
		System.out.println(B.x);
	}

}

/*interface Info1
{
	public void method1();
}
interface to interface extends
interface Info2 extends Info1
{
	void method2();
}
public class Interface_Hello implements Info2
{

	
	public static void main(String[] args) 
	{
		Info2 obj=new Interface_Hello();
		obj.method1();
		obj.method2();
	}

	@Override
	public void method1()
	{
		System.out.println("M1");
		
	}

	@Override
	public void method2() 
	{
		
		System.out.println("M2");
	}
	
}*/
	