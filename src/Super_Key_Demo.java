package learn.java.program;

/*How to use super keyword to access the variables of parent class*/
/*public class Super_Key_Demo extends Parent_Class //extends Super
{
	int num=110;
	private void display() 
	{
		System.out.println(super.num);
		System.out.println(num);
		
	}
	
	public static void main(String[] args)
	{
		Super_Key_Demo s=new Super_Key_Demo();
		s.display();
		}
}
class Super
{
	int num=100;
}*/

/* Use of super keyword to invoke constructor of parent class*/
public class Super_Key_Demo extends Parent_Class //extends Super
	{
	public static void main(String[] args)
	{
		Super_Key_Demo obj1=new Super_Key_Demo();
		obj1.display();
		Super_Key_Demo obj2=new Super_Key_Demo(10);
		obj2.display();
	}
	Super_Key_Demo() 
	{
		System.out.println("Constructor of child class");
	}
	
	Super_Key_Demo( int num)
	{
		System.out.println("args constuctor of child class");
	}
	void display()
	{
		System.out.println("hello");
	}
}

class Parent_Class
{
	public Parent_Class() 
	{
		System.out.println("Constructor of parent class");
	}
}

/*Parameterized super() call to invoke parameterized constructor of parent class*/
/*public class Super_Key_Demo extends Parent_Class //extends Super
	{
	public static void main(String[] args)
	{
		Super_Key_Demo obj1=new Super_Key_Demo();
		obj1.display();
		
	}
	
	Super_Key_Demo() 
	{	
		super();
	//	super("welcome"); 
		System.out.println("Constructor of child class");
	}
	
	Super_Key_Demo( int num)
	{
		System.out.println("args constuctor of child class");
	}
	void display()
	{
		System.out.println("hello");
	}
}

class Parent_Class
{
	Parent_Class() 
	{
		System.out.println("no-arg constructor of parent class");
	}
	
	Parent_Class(String str)
	{
		System.out.println("parameterize constructor of parent class");
	}
}*/
/*How to use super keyword in case of method overriding*/
/*class Parentclass
{
   //Overridden method
   void display(){
	System.out.println("Parent class method");
   }
}

public class Super_Key_Demo extends Parentclass //extends Super
{
	void display()
	{
		System.out.println("Child class method");
    }
   void printMsg()
   {
		
	   display();
	   //super.display();
   }
	public static void main(String[] args)
	{
		Super_Key_Demo obj=new Super_Key_Demo();
		obj.printMsg();
	}
	
}
*/