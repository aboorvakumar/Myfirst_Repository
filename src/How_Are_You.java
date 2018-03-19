import java.util.Arrays;


public class How_Are_You
{

	public static void main(String[] args)
	{
		String[] s={"how","are","you"};
	
		
		for(int i=0; i<s.length; i++)
		{
			Arrays.sort(s);
			System.out.println(s[i]);
			
			//System.out.println(s.length);
		}
		
		
	}

}
