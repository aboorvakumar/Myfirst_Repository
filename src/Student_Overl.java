package learn.java.program;


public class Student_Overl 
{

	static int t=80,e=87,m=70,s=90,ss=90;
	public static void main(String[] args) 
	{
		
		School_Overloading school=new School_Overloading();
		school.calculater(2,4,8,1);
		school.calculater(5,5);
		school.calculater();
		school.calculater(t,e,m,s,ss);
		Student_Overl stu=new Student_Overl();
		school.calculater(stu);
		

		
	}

}
