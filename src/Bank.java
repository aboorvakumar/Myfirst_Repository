package learn.java.program;

class Bank 
{
	int no;
	String custername;
	public int total=500;
	
	public Bank(Customer aboorva) 
	{
		
		this.custername=aboorva.name1;
		this.no=aboorva.mobile;
	}


	
	void accountOpening()
	{
		
	//	System.out.println("welcome to Indian Bank Custermer Name:"+hari);
		
	//	System.out.println("your phone is:"+no);
		System.out.println(" Custermer Name:"+custername);
		
		System.out.println("your phone is:"+no);
	}
/*	public Bank() 
	{
	System.out.println("hello");	
	}*/
	/*public Bank(int i)
	{
		System.out.println(i);
	}*/
	
	
	public int getTotal() 
	{
		return total;
	}
	public void setTotal(int total) 
	{	
		if(total>500)
		{
			
			this.total = total;
			System.out.println(total);
		}
	}
	public void accountopen() 
	{
		System.out.println("Account Open");
	}
	public void deposite()
	{
		System.out.println("Deposite Money");
	}
	public void withdraw()
	{
		System.out.println("Withdraw");
	}
	
}
