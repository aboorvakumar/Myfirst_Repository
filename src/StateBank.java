package learn.java.program;

class StateBank  extends ReserveBank
{

	public static void main(String[] args) 
	{
		
		 StateBank state=new StateBank();
		 state.offers();
		 /* state.provideInterast();
		 state.printCurrenecy();
		 state.newRules();
		 state.discount();*/
		ReserveBank re=new StateBank();
		re.discount();
		re.provideInterast();
		re.newRules();
		re.printCurrenecy();
		
	}

	@Override
	void provideInterast() 
	{
		System.out.println("ProvideInterest");
	}

	@Override
	void discount()
	{
		System.out.println("Discount");
		
	}
	void offers()
	{
		System.out.println("Offers");
	}

}
abstract class ReserveBank
{
	abstract void provideInterast();
	
	abstract void discount();
	
	void printCurrenecy()
	{
		System.out.println("PrintCurrenecy");
	}
	void newRules()
	{
		System.out.println("New Rules Implements");
	}
}