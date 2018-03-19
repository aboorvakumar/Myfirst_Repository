package learn.java.program;


public class Trainee 
{
	String name,course,graduation,year,Address;

	public Trainee(String string, String string2, String string3, String string4) 
	{
		this.name=string;
		this.course=string2;
		this.graduation=string3;
		this.year=string4;
	}

	public Trainee(String string, String string2, String string3) 
	{
		this.name=string;
		this.course=string2;
		this.year=string3;
		
	}

	public Trainee(String string) 
	{
		Address=string;
		
	}


	public static void main(String[] args) 
	{
		Trainee aboorva=new Trainee("aboorva","java","UG","2016");
		
		Trainee rajesh=new Trainee("rajesh","java","2016");
		
		Trainee mani=new Trainee("mani");
		
		
		Payilagam p=new  Payilagam(aboorva);
		p.publish();
		p=new Payilagam(rajesh);
		p.publish();
		p=new Payilagam(mani);
		p.publish();
		
		

	}

}
