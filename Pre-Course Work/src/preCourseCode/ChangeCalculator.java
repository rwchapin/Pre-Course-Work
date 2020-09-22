package preCourseCode;

public class ChangeCalculator {
	
		public static void main(String[] args) {
			
			/*
			 * returnChange(18, 17.18)
				RESULT: Quarters: 3
 						Dimes: 0
 						Nickels: 1
 						Pennies: 2
			 */
				
				double cashGiven = 18;
				double itemAmount = 17.18;
				
				denominations(cashGiven,itemAmount);
				
						
		
			}
			private static void denominations(double cashGiven, double itemAmount) {
				int quarter = 25;
				int dime = 10;
				int nickel = 5;
				int penny = 1;
				double cashBack = cashGiven - itemAmount;
			
				
				int totalChange = (int) ((double) cashBack * 100);
				System.out.println(totalChange + " cents change");
				
			
					int quarterAmount = (int) (totalChange / quarter);
					System.out.println("Quarters: " + quarterAmount);
					int totalA = (int) (totalChange - quarterAmount * quarter); 
					
					int dimeAmount = (int) (totalA / dime);
					System.out.println("Dimes: " + dimeAmount);
				
					int nickelAmount = (int) (totalA / nickel );
					System.out.println("Nickels: " + nickelAmount);
					int totalB = (int) totalA - nickel;
				
					int pennyAmount = (int) (totalB / penny);
					System.out.println("Penny: " + pennyAmount);
				}
	
		
		
		
				
	}


