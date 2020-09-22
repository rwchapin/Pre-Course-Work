package preCourseCode;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int num = in.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("The Number is EVEN");
		}
		else {
			System.out.println("The Number is ODD");
		}

	}

}
