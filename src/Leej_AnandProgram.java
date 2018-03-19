
public class Leej_AnandProgram 
{

	
	public static void main(String[] args) 
	{
		String name="leej anand";
		char[] ch=name.toCharArray();
		
		for(int i=0; i<ch.length-2; i++)
		{
			if(ch[i]==ch[i+2] &&ch[i+1]==ch[i+3])
			{
				System.out.print(ch[i]+""+ch[i+1]);
			}
			
		}

	}

}
