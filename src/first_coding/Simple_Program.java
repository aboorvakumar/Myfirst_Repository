package first_coding;


import java.util.Scanner;


public class Simple_Program 
{

	
	public static String day;

	static int idly,pongal,poori;
	static int meals,curd,sambar,nch,id,dosai,breakfast_total,dinnertotal,lunchtotal;


	public static void main(String[] args) 
	{	
	
		Simple_Program simple=new Simple_Program();
		int ans=simple.hotelbill();
	//	int month=simple.income();
		System.out.println("Per day Income is Rs="+ans);
	//	System.out.print(month);
	
		

	}

	public int hotelbill() 
	{
		
		System.out.print("Enter the Chooice:");
		System.out.println();
		System.out.println("1.BreakFast");
		System.out.println("2.Lunch");
		System.out.println("3.Dinner");
	
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the options:");
		int day=scanner.nextInt();
	
		switch(day)
		{
		case 1:        /*idly*/
			System.out.println("1.BreakFast");
			System.out.println("a).Idly");
			System.out.println("b).Pongal");
			System.out.println("c).Poori");
			System.out.println("Idly(1) Rs:5");
			Scanner s=new Scanner(System.in);
			System.out.print("How many Idlys:");
			idly = s.nextInt();
			int nidly=5*idly;
			System.out.println("Total Idly is Rs="+nidly);
						/*pongal*/
			System.out.println("Pongal(1) Rs:20");
			Scanner sc=new Scanner(System.in);
			System.out.print("How many Pongal:");
			pongal=sc.nextInt();
			int np=20*pongal;
			System.out.println("Total Pongal is Rs="+np);
						/*poori*/
			System.out.println("Poori(1) Rs:10");
			Scanner sca=new Scanner(System.in);
			System.out.print("How many Poori:");
			poori=sca.nextInt();
			int npo=10*poori;
			System.out.println("Total Poori is Rs="+npo);
			breakfast_total=nidly+np+npo;
			System.out.println("BreakFast Total Value is Rs="+breakfast_total);
			break;
			
		case 2:			/*Meals*/
			System.out.println("2.Lunch");
			System.out.println("a).Meals");
			System.out.println("b).Curd Rice");
			System.out.println("c).Sambar Rice");
			System.out.println("Meals(1) Rs:50");
			Scanner sm=new Scanner(System.in);
			System.out.print("How many Meals:");
			meals=sm.nextInt();
			int nm=50*meals;
			System.out.println("Total Meals is Rs="+nm);
						/*Curd Rice*/
			System.out.println("Curd Rice Rs:20");
			Scanner scu=new Scanner(System.in);
			System.out.print("How many Curd Rice:");
			curd=scu.nextInt();
			int ncu=20*curd;
			System.out.println("Total Curd Rice is Rs="+ncu);
						/*Sambar Rice*/
			System.out.println("Sambar Rice  Rs:20");
			Scanner ssam=new Scanner(System.in);
			System.out.print("How many Sambar Rice:");
			sambar=ssam.nextInt();
			int nsa=20*sambar;
			System.out.println("Total Sambar Rice is Rs="+nsa);
			dinnertotal=nm+ncu+nsa;
			System.out.println("Lunch Total Value is Rs="+dinnertotal);
			break;
		case 3:			/*idly*/
			System.out.println("3.Dinner");
			System.out.println("a).Idly");
			System.out.println("b).Dosai");
			System.out.println("c).Chappathi");
			System.out.println("Idly(1) Rs:5");
			Scanner si=new Scanner(System.in);
			System.out.print("How many Idlys:");
			id = si.nextInt();
			int nidle=5*id;
			System.out.println("Total Idly is Rs="+nidle);
						/*Dosai*/
			System.out.println("Dosai(1) Rs:10");
			Scanner scha=new Scanner(System.in);
			System.out.print("How many Dosai:");
			dosai = scha.nextInt();
			int ndosai=10*dosai;
			System.out.println("Total dosai is Rs="+ndosai);
						/*Chappathi*/
			System.out.println("Chapathi(1) Rs:10");
			Scanner pathi=new Scanner(System.in);
			System.out.print("How many Chappathi:");
			nch = pathi.nextInt();
			int nchapathi=10*nch;
			System.out.println("Total Chappathi is Rs="+nchapathi);
			lunchtotal=nidle+ndosai+nchapathi;
			System.out.print("Total Dinner Value is Rs="+ lunchtotal);
			break;
		
			
		default:
			System.out.println("Try Again!!");
		}
		System.out.println("Do you want to Continue :");
		String s=scanner.next();
		if(s.equals("yes")){
			//goto hotelbill();
		}
		int income =breakfast_total+dinnertotal+ lunchtotal;
		return income;
	
	}


		
		
		
	

}
