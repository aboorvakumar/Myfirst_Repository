package learn.java.program;

import java.util.Scanner;


public class Restaruant_Management_System 
{
	public static String k;
	public static int s,gtotal;
	public static  int vg1,vg2,nvege1,nvege2,blueberry,chocolate,korma,fish,b,a,veg1;
	public static void main(String[] args) 
	{ 
		int userinput,Veg=1,NonVeg=2,nv1=1,nv2=2,v1=1, v2=2;

		int total=0;
		
		do{
		System.out.println("==============================");
		System.out.println("|Restaurant Management System|");
		System.out.println("==============================");
		System.out.println("|Options:                    |");
		System.out.println("|1.Starters                  |");
		System.out.println("|2.Main Course               |");
		System.out.println("|3.Desserts                  |");
		System.out.println("|4.Exit                      |");
		System.out.println("==============================");
		try{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Option:");
		userinput=sc.nextInt();

		switch (userinput)
		{
		case 1:
			do{
				try{
				System.out.print("1.Veg(OR)");
				System.out.println("2.Non Veg");
				System.out.print("Enter the Choice:");
				s=sc.nextInt();

				if(Veg == s)
				{
					System.out.println("1.Veg");
					System.out.println("a).Bean and Barley Soup(1)-------Rs.50");
					System.out.println("b).Thai Coconut Soup(1)-------Rs.100");
					System.out.print("Choose the Option:");
					veg1=sc.nextInt();

					System.out.print("How many:");
					b=sc.nextInt();

					if(v1 == veg1)
					{
						b*=50;
						System.out.println("Bill Amt is:"+b);

					}
					else if(v2 == veg1)
					{
						
						b*=100;
						System.out.println("Bill Amt is:"+b);
					}
					else
					{
						System.out.print("Invalid");
					}total+=b;
					
				}	

				else if(NonVeg == s)
				{
					System.out.println("2.Non Veg");
					System.out.println("a).Chicken Noodle Soup(1)-------Rs.150");
					System.out.println("b).Mutton Ribs Soup(1)-------Rs.200");
					
					System.out.print("Choose the Option:");
					veg1=sc.nextInt();
					System.out.print("How many:");
					a=sc.nextInt();

					if(nv1 == veg1)
					{
						nvege1=150*a;
						System.out.print("Bill Amt is:"+nvege1);
					}
					else if(nv2 == veg1)
					{
						nvege1=200*a;
						System.out.println("Bill Amt is:"+nvege1);
					}
					else
					{
						System.out.print("Invalid");
					}
				}
				else
				{
					System.out.println("Invalid");
				}
				
				}catch(Exception e)
				{
					System.out.println("Try Again");
				}
				total+=nvege1;
				System.out.println("Do you want order more(y/n):");
				k=sc.next();
	
			}while(k.equals("y"));
			break;

		case 2:
			do{
				System.out.println("2.Main Course");
				System.out.print("1.Veg(OR)");
				System.out.println("2.Non Veg");
				System.out.print("Enter the Choice:");
				s=sc.nextInt();
				if(Veg == s)
				{
					System.out.println("1.Veg");
					System.out.println("a).Mushroom tart(1)-------Rs.250");
					System.out.println("b).Triple cheese(1)-------Rs.300");
					System.out.print("Choose the Option:");
					int veg1=sc.nextInt();

					System.out.print("How many:");
					int b=sc.nextInt();

					if(v1 == veg1)
					{
						b*=250;
						System.out.println("Bill Amt is:"+b);
					}
					else if(v2 == veg1)
					{
						b*=300;
						System.out.println("Bill Amt is:"+b);
					}
					else
					{
						System.out.print("Invalid");
					}total+=b;


				}


				else if(NonVeg == s)
				{
					System.out.println("2.Non Veg");
					System.out.println("a).Spring Onion Mutton(1)-------Rs.500");
					System.out.println("b).Chili Chicken(1)-------Rs.300");

				
					System.out.print("Choose the Option:");
					int nveg1=sc.nextInt();

					
					System.out.print("How many:");
					int a=sc.nextInt();

					if(nv1 == nveg1)
					{
						a*=500;
						System.out.print("Bill Amt is:"+a);
					}
					else if(nv2 == nveg1)
					{
						a*=300;
						System.out.println("Bill Amt is:"+a);
					}
					else
					{
						System.out.println("Invalid");
					}total+=a;

				}
				else
				{
					System.out.println("Invalid");
				}
				System.out.println("Do you want order more(y/n):");
				sc.nextLine();
				k=sc.nextLine();
			}while(k.equals("y"));
			break;

		case 3:
			do{
				System.out.println("3.Deserts");
				System.out.println("1.Veg");
				
				System.out.print("Enter the Choice:");
				s=sc.nextInt();

				if(Veg == s)
				{
					System.out.println("1.Veg");
					System.out.println("a).Blueberry & Coconut Cake(1)-------Rs.550");
					System.out.println("b).Chocolate marquise(1)-------Rs.600");
				
					System.out.print("Enter the Option:");
					veg1=sc.nextInt();

					System.out.print("How many:");
					b=sc.nextInt();

					if(v1 == veg1)
					{
						b*=550;
						System.out.println("Bill Amt is:"+b);
					}
					else if(v2 == veg1)
					{
						b*=600;
						System.out.println("Bill Amt is:"+b);
					}
					else
					{
						System.out.println("Invalid");
					}
					total+=b;

				}


				/*else if(NonVeg == s)
			{
				System.out.println("2.Non Veg");
				System.out.println("a).Mutton Korma(1)-------Rs.650");
				System.out.println("b).Fish Biryani(1)-------Rs.700");

				Scanner o=new Scanner(System.in);
				System.out.print("Choose the Option:");
				int nveg1=o.nextInt();

				Scanner ob=new  Scanner(System.in);
				System.out.print("How many:");
				int a=ob.nextInt();

				if(nv1 == nveg1)
				{
					korma=650*a;
					System.out.print("Bill Amt is:"+korma);
				}
				else if(nv2 == nveg1)
				{
					fish=700*a;
					System.out.println("Bill Amt is:"+fish);
				}
				else
				{
					System.out.println("Invalid");
				}*/

				//}
				else
				{
					System.out.println("Invalid");
				}
				System.out.println("Do you want order more(y/n):");
				sc.nextLine();
				k=sc.nextLine();
			}while(k.equals("y"));

			break;

		case 4:
			System.out.println("4.Exit");
			break;
		default:
			System.out.println("Invalid selection");
			break;
		}
		
		int gst=total*18/100;
		gtotal=total+gst;
		System.out.println("Total : "+gtotal);
		System.out.println("Do you want order more(y/n):");
	//	sc.nextLine();
		k=sc.next();
		}catch(Exception e)
		{
			System.out.println("Invalid Option");
		}/*finally
		{
			System.out.println("Try");
		}*/
	}while(k.equals("y"));
		
		System.out.println("Thanks for coming! Welcome again!");
	}
	

}
