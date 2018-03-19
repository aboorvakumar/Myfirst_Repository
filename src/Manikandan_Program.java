
public class Manikandan_Program
{

	
	public static void main(String[] args)
	{
		String name="manikandan";
		char[] ch=name.toCharArray();
		/*for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				for(int k=j+1; k<ch.length; k++)
				{
				//	if( ch[j]=='a' &&  ch[k]=='n')
					//{
						System.out.println(ch[i]+"" +ch[j]+""+ ch[k]);
						//break;
					//}
					
				}
			}
		}*/
		
	for(int i=0; i<ch.length-2; i++)
	{
		if(ch[i+1]=='a' && ch[i+6]=='n')
		{
			System.out.println(ch[i+1]+""+ch[i+6]);
		}
		
	}
		
	}

}
