package HOMEWORK2;

import java.util.Scanner;

public class Container {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Array[] = new int [5];
		
		for (int counter = 0; counter < Array.length; counter++) {
			
			System.out.println("Please enter your value at element: " + (counter + 0));
			Array[counter] = sc.nextInt();
			
			
			
		}
		
		System.out.println("So Far You Have Entered");
		
		for(int counter = 0; counter < Array.length; counter++) {
			
			System.out.println(Array[counter]);
			// Array.close() Should be here
		
			
		}
		
	}

}
