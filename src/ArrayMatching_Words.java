package learn.java.program;

/*To find first letter and Last letter should be same in the given Name*/
public class ArrayMatching_Words 
{
	public static void main(String[] args) 
	{
		String name="aboorva kumark";
		char[] ch=name.toCharArray();
		int temp=0;
		int t=0;
		for(int i=0; i<ch.length; i++)
		{
			
			if(ch[i]==' ')
			{
			temp=ch[i-1];
			
			}
			else if(temp==ch[i])
			{
				System.out.println("The Same Char is:"+ch[i]);
			}
			if(ch[i]==' ')
			{
				t=ch[i+1];
			}
			else if(t==ch[i])
			{
				System.out.println("Not Matching:"+ch[i]);
			}
			/*else
			{
				System.out.println("Not Same");
			}*/
			
		}	
			

		
	}	
}
