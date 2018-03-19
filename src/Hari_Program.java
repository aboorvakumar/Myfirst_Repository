
public class Hari_Program 
{

	/*Consecutive Program which is come like kanna (nn)*/
	public static void main(String[] args) 
	{
		
		String name="hari  ikanna";
		char[] ch=name.toCharArray();
		for(int i=0; i<ch.length-1; i++)
		{int count=1;
			if(ch[i]==ch[i+1]) 
			{

				System.out.println("The Consecutive char is:"+ch[i]);
				count++;
				System.out.println("The Total Count is:"+count);
			}
			
		}

	}

}
