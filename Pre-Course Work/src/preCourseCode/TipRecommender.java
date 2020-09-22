package preCourseCode;

public class TipRecommender {
	
		public static void main(String[] args) {
			/* formula tip amount = bill * percent
			 * 
			 * Poor 16%
			 * Good 22%
			 * Great 26%
			 * 
			 * computeTip(33.57, "Great")
			 * RESULT: 8.7282
			 */
			
		
			double totalBill = 33.57;
			System.out.println("Your total bill is: " + totalBill);
			
			String serviceQuality = "great";
			System.out.println("Your service quality was: " + serviceQuality);
			
			
			
			
			tipAmount(totalBill,serviceQuality);
			
			
	
		}
		private static double tipAmount(double totalBill, String serviceQuality) {
			double tipAmount = 0;
			double poor = .16;
			double good = .22;
			double great = .26;
			
			
			if (serviceQuality == "great") {
				tipAmount = totalBill * great;
			}
			else if (serviceQuality == "good") {
				tipAmount = totalBill * good;
			}
			else if (serviceQuality == "poor") {
				tipAmount = totalBill * poor;
			}
			System.out.println("Your tip amount: " + tipAmount);
			return tipAmount;
			
			
			
			
			
		}

}
