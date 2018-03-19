
public class Garbage_Code1 
{

	
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
		{
			Garbage_Code1 obj=new Garbage_Code1();
		}
		Runtime rt=Runtime.getRuntime();
		System.out.println(rt.freeMemory());
		rt.gc();
//		System.out.println();
		System.out.println(rt.freeMemory());
		
		
		//obj=null;
		
/*		Garbage_Code1 a=new Garbage_Code1();
		Garbage_Code1 b=new Garbage_Code1();
		b=a;
		System.gc();
		a.finalize();
		//String name="Aboorva";
		//System.gc();
*/
	}
	protected void finalize() 
	{
		System.out.println("Garbage collection is perfomed by jvm");
	}

}
