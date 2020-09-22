package preCourseCode;

public class SavingsCalculator {
	
		public static void main(String[] args) {
			
			/* savings($20000, 4.5%, 15)
			 * convert percent to decimal 4.5 / 100 
			 * calculation formula - FV = PV * [1 + (rate x time) ] 
			 * RESULT: 33500
			 */
			
				double presentValue = 20000;
				System.out.println("Savings Present Value: " + presentValue);
				
				double rate = .045;
				System.out.println("Your interest rate: " + rate);
				
				double time = 15;
				System.out.println("Amount of time: " + time);
				
				double savingsFutureValue = futureValue(presentValue,rate,time);
				
				System.out.println("Your savings future value will be: " + savingsFutureValue);
				
			}
			
			private static double futureValue(double presentValue, double rate, double time) {
				double futureValue = 0;
				futureValue = presentValue * (1 +(rate*time));
				return futureValue;
		
	}

}
