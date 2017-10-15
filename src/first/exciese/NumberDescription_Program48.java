package first.exciese;

public class NumberDescription_Program48 
{

	
	public static void main(String[] args) 
	{
	int number=5;
	switch(number)
	{
	case 2:
	case 4:
	case 6:
	case 8:
		System.out.println("Even");
		break;
	case 1:
	case 3:
	case 5:
	case 7:
	case 9:
		System.out.println("Odd");
		break;
	case 21:
	case 31:
	case 51:
	case 71:
		System.out.println("Prime");
		break;
	case 41:
	case 91:
		System.out.println("Perfect Square");
		break;
	default:
		System.out.println("Can only describe number from 1 to 9");
		
	}

	}

}
