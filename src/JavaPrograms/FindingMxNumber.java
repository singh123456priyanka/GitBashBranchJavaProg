package JavaPrograms;
import java.util.Scanner;


public class FindingMxNumber{
	
	
	public static void main(String[] Args) {
		int [] arr= {4,5,6,1,4};
		
		int storeMax = arr[0]; //4
		int storeMin=arr[0]; //4
		for(int i=0;i<arr.length;i++) {
			
			if(storeMax<arr[i]){
			storeMax=arr[i];
			}
			else if(storeMin>arr[i])  {
				storeMin=arr[i];
			}

		}		
		System.out.println("Largest Number: "+storeMax);
		System.out.println("Smallest Number: "+storeMin);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the length of array: ");
		byte l = sc.nextByte();
		int[] war= new int[l];
		
		
		for(int i=0;i<war.length;i++) {
		System.out.println("Input the number: ");
		byte num = sc.nextByte();
		war[i]=num;	
		}
		
		storeMax=war[0];
		storeMin=war[0];
		System.out.println("::Input array is::");
		
		for(int i=0;i<war.length;i++) {
			System.out.println(war[i]);
			if(storeMax<war[i]) {
				storeMax=war[i];
			}
			else if(storeMin>war[i]) {
				storeMin=war[i];
			}
		}
		System.out.println("Max Number: "+storeMax);
		System.out.println("Min Number: "+storeMin);
		
	}

}
//clone //https://github.com/rathinreddy1402/qspiders.git Jul 7, 11:51 AM
