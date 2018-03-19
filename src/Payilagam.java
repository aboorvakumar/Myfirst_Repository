
public class Payilagam
{
	String tname,courses,graduations,years,Address;

	public Payilagam(Trainee aboorva)
	{
		this.tname=aboorva.name;
		this.courses=aboorva.course;
		this.graduations=aboorva.graduation;
		this.years=aboorva.year;
		
		Address=aboorva.Address;
		
	}

	public void publish()
	{
		System.out.println("Trainee Name:"+tname);
		System.out.println("Course:"+courses);
		System.out.println("Degree:"+graduations);
		System.out.println("Year of passing:"+years);
		
		System.out.println("Address:"+Address);
		
		
		
	}
	


}
