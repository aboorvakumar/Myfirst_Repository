public class Interface_Simbu implements  Interface_Actors
{

	public static void main(String[] args) 
	{
		Interface_Simbu in=new Interface_Simbu();
		in.dance();
		in.sing();
		in.comedy();
		in.act();
	}

	@Override
	public void dance() 
	{
		System.out.println("dance");
		
	}

	@Override
	public void sing()
	{
		System.out.println("sing");
	}

	@Override
	public void comedy() 
	{
		System.out.println("comedy");
		
	}

	@Override
	public void act()
	{
		System.out.println("act");
		
	}

}
