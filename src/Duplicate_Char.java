
public class Duplicate_Char
{

	
	public static void main(String[] args) 
	{
		
		String name="mahesh";
		char[] ch=name.toCharArray();
		int count = 0,total;
		for(int i=0; i<name.length(); i++)
		{
			for(int j=i+1; j<name.length(); j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("This are the Duplicate char:"+ch[i]);
					count =count+1;
					System.out.println("Total count is:"+count);
					
				}
				
			}
			
		}
		//System.out.print(ch);
	}

}
