
public class Hari_Kishore 
{
	/*TO interchange the charactors among the name*/
	public static void main(String[] args) 
	{
		String name="hari";
		char[] ch=name.toCharArray();
		char  temp=0;
		int i;
		for(i=0; i<ch.length-1; i++)
		{
			temp=ch[i+1];
			ch[i+1]=ch[i];
			ch[i]=temp;
			temp=ch[i++];
			
		}
		for(int k=0; k<ch.length; k++)
		{
			System.out.println(ch);
			break;
		}
	}

}
