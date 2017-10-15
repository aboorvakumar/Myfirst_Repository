package first_coding;

public class Revarse_Single {

	
	public static void main(String[] args) 
	{
		int rc=3;
		do{
			int bc=0;
			do{
				bc=bc+1;
				System.out.print("*");
				System.out.print(" ");
				
			}while(bc<rc);
			rc=rc-1;
			System.out.println();
		}while(rc>0);

	}

}
