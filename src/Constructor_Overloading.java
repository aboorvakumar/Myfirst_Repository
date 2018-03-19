
public class Constructor_Overloading 
{
	int r_no;
	String name;

	public Constructor_Overloading(int i, String string) 
	{
		r_no=i;
		name=string;
		
	}
	public Constructor_Overloading(String string) 
	{
		name=string;
	}
	void student()
	{
		System.out.println("The Roll No:"+ r_no);
		System.out.println("The Name:"+ name);
		
	}
	public static void main(String[] args)
	{
		Constructor_Overloading c=new Constructor_Overloading(101,"aboorva");
		c.student();
		Constructor_Overloading con=new Constructor_Overloading("kumar");
		con.student();
		

	}

}
