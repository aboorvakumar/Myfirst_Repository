package first_coding;

public class OppsiteOf_RevarseSingle 
{

	/*percial output*/
	public static void main(String[] args) 
	{	
		
	//	while(rc<=2)
	//	{	
	//	for(int lrc=3; lrc>0; lrc-- ){
			int lrc=3;
			do{	
				for(int rc=1; rc<=2; rc++)
				{
					for(int rbc=0; rbc<lrc; rbc++)
					{
						System.out.print("*");
						System.out.print(" ");
					}
					System.out.println();
					for(int bbc=0; bbc<rc; bbc++)
					{
						System.out.print(" ");
						System.out.print(" ");
					}lrc=lrc-1;
				}
				
			}while(lrc>0);
		
	//	}
		
	}	

}
