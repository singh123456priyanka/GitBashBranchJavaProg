package JavaPrograms;

import java.util.Scanner;

//Program to Del space between the string.
public class DeletingSpaceBetwString {

	public static void main(String[] args) {
		
		String bfrsen="My name is Priyanka";
		System.out.println("Before: "+bfrsen);
		String aftsen = bfrsen.replaceAll(" ","");
		System.out.println("After: "+aftsen);
		
		//input string
		Scanner newsen= new Scanner(System.in);
		System.out.println("Enter the string: ");
		bfrsen= newsen.nextLine();
		aftsen=bfrsen.replaceAll(" ","");
		System.out.println(aftsen);
		
		//3 times repeat karega string
		String a = aftsen.repeat(3);
		System.out.println(a);
		
		//replace the 
		System.out.println(aftsen.replace("o","XX"));

	}

}
