package first_coding;

import java.util.Arrays;

public class DesOrder_Program
{
	public static int i;
	/*Desending order Array*/
	public static void main(String[] args) 
	{
		int[] set=new int[] {1,2,3,4,5};
		int temp,swap=0;
		for(int i=0; i<=4; i++)
		{
			
			for(int j=1; j<=4; j++)
			{
				if(set[i]<set[j])
				{
				//	swap=swap+1;
					temp=set[i];
					set[i]=set[j];
					set[j]=temp;
				}
			}
		}System.out.println(set[i]+ ",");
	/*	for(int i=0; i<=4; i++)
		{
			System.out.println(set[i]+ ",");
			
		}*/

	} 
	//System.out.print(set[4-1]);
		/*Array Sort*/
		/*int[] aboorva=new int[] {4,5,7,7,0,3,6,2};
		Arrays.sort(aboorva);
		for(int i=0; i<aboorva.length; i++)
			{
				System.out.print(aboorva[i]+",");
			}
		}*/
		
		
}
