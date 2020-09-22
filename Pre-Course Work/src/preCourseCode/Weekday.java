package preCourseCode;

import java.util.Scanner;

public class Weekday {
	
		public static void main(String[] args) {
		
				Scanner in = new Scanner(System.in);
				
				System.out.print("Enter numeric day: ");
				int num = in.nextInt();
				
				if (num == 1) {
					System.out.println("The day is Sunday");
				}
				else if (num == 2) {
					System.out.println("The day is Monday");
				}
				else if (num == 3) {
					System.out.println("The day is Tuesday");
				}
				else if (num == 4) {
					System.out.println("The day is Wednesday");
				}
				else if (num == 5) {
					System.out.println("The day is Thursday");
				}
				else if (num == 6) {
					System.out.println("The day is Friday");
				}
				else if (num == 7) {
					System.out.println("The day is Saturday");
				}
				else {
					System.out.println("invalid Weekly Number");
				}
		
	}

}
