import java.util.Scanner;


public class Eletronic_Shop
{
	static String name,k;
	static int mobile,price;
	static int hp,lenovo,dell,apple;
	static double l;
	
	

	String c_name;
	int mobile_no,rate;
	double discount;
	
	@SuppressWarnings("unused")
	void discount()
	{
		
		System.out.println("**********************");
		System.out.println("    Electronic Shop   ");
		System.out.println("**********************");
		System.out.println("    1.Lenovo          ");
		System.out.println("    2.HP              ");
		System.out.println("    3.Dell            ");
		System.out.println("    4.Apple           ");
		System.out.println("**********************");
		
		System.out.print("Enter the Option:");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		
		switch (ch) 
		{
		case 1:
			
			if(ch==1)
			{	
				int len=20000;
				System.out.println("-----Lenovo Rs.20000-/----");
				if(len>0 && len<=25000)
				{
					System.out.print("Enter the Quantity:");
					lenovo=sc.nextInt();
					lenovo*=len;
					len=(int) (lenovo*0.05);
					
					System.out.print("RS."+(lenovo-len));
					//System.out.println("5%");
				}
			}while(k.equals("y"));
			break;
		case 2:
			if(ch==2)
			{	
				int h=40000;
				System.out.println("-----HP Rs.40000-/----");
				if(h>25000 && h<50000)
				{
					System.out.print("Enter the Quantity:");
					hp=sc.nextInt();
					hp*=h;
					l=hp*7.5;
					System.out.println("RS."+(l-hp));
					//System.out.println("7.5%");
				}
			}break;
			
		case 3:
			if(ch==3)
			{
				System.out.println("-----Dell Rs.80000-/----");
				int e=80000;
				if(e>50000 && e<100000)
				{
					System.out.println("Enter the Quantity:");
					dell=sc.nextInt();
					dell*=e;
					l=dell*10.0;
					System.out.println("Rs."+(l-dell));
					
				}
			}break;
			
		case 4:
			if(ch==4)
			{	
				int app=100000;
				System.out.println("-----4.Apple Rs.100000-/ ----");
				if(100000 >= app &&  app<200000)
				{
					System.out.println("Enter the Quantity:");
					apple=sc.nextInt();
					apple*=app;;
					l=apple*15.0;
					System.out.println("Rs."+(l-apple));
				}
			
			
			}break;

		default:
			System.out.println("Invalid Entry!!!");
			break;
		}//discount();
	}
	void display()
	{
		System.out.println("Customer Name:"+c_name);
		System.out.println("Mobile No:"+mobile_no);
		//System.out.println("The Amt is:"+rate);
		//System.out.println("The Discount:"+discount);
	}
	public Eletronic_Shop(String name2, int mobile2) 
	{
		c_name=name2;
		mobile_no=mobile2;
		//rate=price2;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.print("Enter the Customer Name:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		
		System.out.print("Enter the Mobile No:");
		mobile=sc.nextInt();
		
		/*System.out.print("Enter the Price");
		price=sc.nextInt();*/
		
		//System.out.println(n);
		
		
		Eletronic_Shop obj1=new Eletronic_Shop(name,mobile);
		obj1.display();
		obj1.discount();
		
		

	}

}
