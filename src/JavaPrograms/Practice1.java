package JavaPrograms;

import java.util.Scanner;
//add in array first and last no
public class Practice1 {
	public static void main(String[] args) {
		int count;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the count: ");
			count=s.nextInt();
			int[] arr= new int[count];
			int i;
			int firstnum = 0;
			int lastnum=0;			
			for(i=0;i<count;i++) {
				System.out.println("Enter the number: ");
				arr[i]=s.nextInt();
					if (i==0) {
						firstnum=arr[i];
					}
					else if(i==count-1) {
					 lastnum=arr[i];
					}
			}
						
			i=0;
			while(i<count) {
				System.out.println(arr[i]);			
				i++;
			}			
			System.out.println("first number: "+firstnum);
			System.out.println("last number: "+lastnum);
			System.out.println("Sum of the Number: "+(firstnum+lastnum));
		}
	}

}
