import java.util.Scanner;


public class ProfitOrLoss
{

	static int compoundProfit;
	int simpleProfit;
	static int amount;
	static int interest;
	static int year;
	public static void main(String[] args) 
	{	
		
		ProfitOrLoss obj=new ProfitOrLoss();
		obj.display(amount, interest, year, compoundProfit);
		obj.input(amount, interest, year);
	}
	/*default constructor to initialize c_profit,s_profit*/
	public ProfitOrLoss() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Amount:");
		amount=sc.nextInt();
		System.out.print("Enter the interest:");
		interest=sc.nextInt();
		System.out.print("Enter the year:");
		
		
		year=sc.nextInt();
		
	}
	void input(int amount,int interest, int year)
	{
		simpleProfit=(amount*interest*year)/100;
		System.out.println("simple interest:"+simpleProfit);
	}
	void display(int amount,int interest, int year,int p)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the compound Principal:");
		p=s.nextInt();
		simpleProfit=(amount*interest*year)/100;
		compoundProfit=simpleProfit-p;
		System.out.println("compound interest:"+compoundProfit);
		
	}
}
