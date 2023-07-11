package JavaPrograms;

import java.util.Scanner;

public class Fibonicci_series {

	public static void main(String[] args) {
		int count;
		Scanner c= new Scanner(System.in); 
		System.out.println("Enter num: ");
		count = c.nextInt();
		int i=0;
		int j=1;
		int a=0;
		System.out.println(i+"\n"+j);		
		for(int num=2;num<count;num++) {
			a=i+j;
			System.out.println(" "+a);
			i=j;
			j=a;
		}
		
	}
}