package JavaPrograms;

import java.util.Scanner;

class clac1
		{
		double a,b;
		char c;

		clac1(double num1,double num2,char choose)//parameterized constructor
		{
			a= num1;
			b = num2;
			c = choose;
		}

		public void perform()
		{
			double d =0 ;
			
			switch(c){
				case '+': d = a+b;System.out.print( "\t"+a+"\t+\t"+b+"\t=\t"+d+"\n"); break;
				case '-': d = a-b;System.out.print( "\t"+a+"\t-\t"+b+"\t=\t"+d+"\n"); break;
				case '*': d = a*b;System.out.print( "\t"+a+"\tX\t"+b+"\t=\t"+d+"\n"); break;
				case '/': d = a/b; System.out.print( "\t"+a+"\t/\t"+b+"\t=\t"+d+"\n"); break;				
				default: System.out.println("You have choosen the wrong option!!! \n");break;
				
			}
			
			//System.out.print("\t=\t"+d+"\n");
		}

		}

		public class Calc {
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			double first, second;
			char ch;
			
			System.out.println("Number 1 = ");
			first= input.nextDouble();
			
			System.out.println("Number 2 = ");
			second= input.nextDouble();
			
			System.out.println("Choose any operator between(+,-,*,/) : ");
			ch= input.next().charAt(0);
			
			clac1 bb = new clac1(first,second,ch);
			bb.perform();
			



			

		}

		
	}


