
public class Palindrome 
{

	
	public static void main(String[] args) 
	{
		String name="malayalam";
	
		String reverse="";
		int l=name.length();
		for(int i=l-1; i>=0; i--)
		{
			reverse+= name.charAt(i);
		
		}
		if(name.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}	
		
		

	}

}
