class Bank 
{
	public int total=500;
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
