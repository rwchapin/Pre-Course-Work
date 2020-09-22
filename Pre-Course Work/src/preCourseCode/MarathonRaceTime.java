package preCourseCode;

public class MarathonRaceTime {
	
		public static void main(String[] args) {

		int totalSecs = 7724;
		int hours = totalSecs / 3600;
		int remainder = totalSecs - hours * 3600;
		int minutes = remainder / 60;
		remainder = remainder - minutes * 60;
		int secs = remainder;
		
		
		System.out.println("Race Time - " + hours + "hrs:" + minutes + "mins:" + secs + "secs");
		
		double miles = 26.2;
		
		double pace = totalSecs / miles / 60;
		
		System.out.println("Average Pace: " + pace);
		
				
		
		
		
		
	 
	}

}
