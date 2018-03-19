import java.util.Arrays;


public class First_Array
{	
	
	
	int[] marks={88,90,99};
	public static void main(String[] args)
	{
		
		String n="aboorva";
		//Arrays
		First_Array a=new First_Array();
		//a.marks.clone();
		
		
		System.out.println(a);
		System.out.println(n);
		/*int array declaration*/
	//	int[] days;
	//	int day[];
		
		int[] no=new int[3];
		/*no[0]=5;
		no[1]=10;
		no[2]=15;*/
		System.out.println("The length of Array:"+no.length);
		/*int array[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				//System.out.print(array[i][j]);
				System.out.print(array[i][j]);
			}System.out.println();
		}*/
		int x[][]={{1,1,1},{2,2,2}};
		int[][] y={{4,4,4},{5,5,5}};
		
		int[][] z=new int[2][3];
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{	
			try
			{
			
				z[i][j]=x[i][j]+y[i][j];
				System.out.print(z[i][j]+" ");
				
			}catch(Exception e)
			{
				System.out.print("hi");
			}
			}System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
