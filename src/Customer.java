
public class Customer 
{
	String name1;
	int mobile;
	
	
	String name="hari";
	int id=13101;
	public Customer()
	{
		System.out.println("Default constructor created!");
	}
	public Customer(String string, int i) 
	{
		this.name1=string;
		this.mobile=i;
		
	}
	
	public static void main(String[] args)
	{
		//Customer cus=new Customer();
		Customer aboorva=new Customer("Aboorva",12345);
		Customer sathesh=new Customer("Sathesh",98758);
		
		
		Bank sbi=new Bank(aboorva);
		sbi.accountOpening();
		sbi=new Bank(sathesh);
	//	Bank b=new Bank(5);
		
		sbi.accountOpening();
		int a=sbi.getTotal();
	//	a=70;
	//	System.out.println(a);
		sbi.setTotal(1000);

	}

}
