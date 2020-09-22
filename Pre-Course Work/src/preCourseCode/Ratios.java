package preCourseCode;

public class Ratios {
	
		public static void main(String[] args) {
		
		double boys = 11;
		double girls = 16;
		double teachers = 2;
	
		
		double students = boys + girls;
		System.out.println("Students: " + students);
		
		double girlPercentage = girls/students * 100;
		System.out.println("Percentage of Girls: " + girlPercentage);
		
		double boyPercentage = boys/students * 100;
		System.out.println("Percentage of Boys: " + boyPercentage);
		
		double ratio = students / teachers;
		System.out.println("Student-Teacher Ratio: " + ratio);
				

	}

}
