package preCourseCode;

import java.util.Scanner;

public class PositiveNegative {
	
		public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
		
			System.out.print("Enter a number: ");
			int num = in.nextInt();
		
			if (num < 0) {
			System.out.println("The number is Negative.");
		}
			else if (num > 0) {
			System.out.println("The number is Positive.");
		}

	}

}
