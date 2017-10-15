package first.exciese;

public class Tester_Program7
{
	static void test(float x)
	{
		System.out.print("float");
	}
	/*Error Fix*/
	public static void main(String[] args) 
	{
		test((float) 99.9);
	}

}
