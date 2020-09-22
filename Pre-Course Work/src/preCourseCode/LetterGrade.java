package preCourseCode;

import java.util.Scanner;

public class LetterGrade {
	
		public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
		
			System.out.print("Enter Numeric Grade: ");
			int num = in.nextInt();
		
			if (num <=100 & num >=90) {
				System.out.println("Grade is an A");
	}
			else if (num <=89 & num >= 80) {
				System.out.println("Grade is a B");
	}
			else if (num <=79 & num >= 70) {
				System.out.println("Grade is a C");
	}
			else if (num <=69 & num >= 60) {
				System.out.println("Grade is a D");
	}
			else if (num <=59 & num >= 0) {
				System.out.println("Grade is an F");
			
	}
			else {
				System.out.println("Invalid Grade");
	}

	}

}
