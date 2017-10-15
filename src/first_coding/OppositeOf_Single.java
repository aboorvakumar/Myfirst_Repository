package first_coding;

public class OppositeOf_Single
{
	static int rc=2;
	public static void main(String[] args) 
	{	
		int lrc=1;
		do{	
			
			do{ 
				
				for(int bbc=0; bbc<rc; bbc++)
				{
					
					System.out.print(" ");
					System.out.print(" ");
				}
				rc=rc-1;
				for(int rbc=0; rbc<lrc; rbc++)
				{
							
					System.out.print("*");
					System.out.print(" ");
				}
				lrc=lrc+1;
				System.out.println(); 
				
							
			    }while(0<rc);
			
	     }while(lrc<=3);	
	}

}
	