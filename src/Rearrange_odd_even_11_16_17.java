
public class Rearrange_odd_even_11_16_17
{



	public static void main(String[] args) 
	{
		int arr[]={6,8,9,4,5};
		int t=0;
		for(int j=0; j<arr.length-1; j++)
		{
			t=arr[j+1];
			arr[j+1]=arr[j];
			arr[j]=t;
			t=arr[j++];
			
		}
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k]);
		}
		

	}

}
