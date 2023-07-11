package JavaPrograms;

import java.util.Scanner;

		
		/*short guest=0;
		System.out.println("\nGuest arrived(++guest): "+(++guest));
		System.out.println("Guest arrived(guest++): "+(guest++));
		System.out.println("Guest arrived(guest): "+(guest));
		 guest = 50;

		 System.out.println("\nTotal Guest came (guest): "+(guest));
		System.out.println("\nGuest exiting(--guest): "+(--guest));
		System.out.println("Guest exiting(guest--): "+(guest--));
				System.out.println("\nGuest remaining (guest): "+(guest));*/
				
				/*char[] t= {'h','e','l','l','o'};
				System.out.println(t);//hello
				
				
				String s2= new String(t);
				System.out.println(s2);//hello*/
	/*	System.out.println("::Join java course::");
		
		try {
		System.out.println("Login to class on time");
		System.out.println("Interact in class");
		System.out.println("Practice everyday");
		System.out.println("Attend mock interview");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mock Rating(0/1): ");
		int num1= sc.nextInt();
		System.out.println("num1="+num1);
		if(num1==1)
		{
			System.out.println("Performed well");
		}
		else
		{
			int a= 1/num1; //exception
		}
		}
		catch( ArithmeticException e)
		{ 
			System.out.println("Not performed well");
			System.out.println("attend the remock");
		}
		finally {
			System.out.println("Get Interview based on mock");
			System.out.println("Get job");
		}
		
		System.out.println("The end..");*/
		class GovConstructor
		{
			void rd_Construct()
			{
				System.out.println("Constructor construct the road");
				//suppose the road got problem intentionally putting exception here
				int a= 1/0; //intentional exception .....risk.....goes to collar method if there it is handled
			}
		}
		class Minister // collar class to GovConstructor
		{
			void rd_develop() {
				System.out.println("Minister develop the road");
				GovConstructor gvc= new GovConstructor();
				gvc.rd_Construct(); // risk propogated to here // but no handeling so move another class to check
			}
			
		}
		class ChiefMinister{
			void run_Gov() {
				System.out.println("Chief Minister will run the government and check all development");
				Minister min = new Minister();
				min.rd_develop();
				/*try
				{
				min.rd_develop();
				}
				catch(Exception e) {
					System.out.println("Government checks into matter and handled road problem");
				}*/
			}
			
		}

		public class PropogatedException {

			public static void main(String[] args) {
				
				System.out.println("People will Choose CM");
				ChiefMinister cm= new ChiefMinister();
				try {
				cm.run_Gov();
				}
				catch(Exception e)
				{
					System.out.println("\nException handeling:");
					System.out.println("People will have to choose another CM who works");
				}

			}

	}


