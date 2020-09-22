package preCourseCode;

public class StocksCDs {
	
	
		public static void main(String[] args) {

		int money = 25000;
		int stockprice = 989;
		
		int numberOfStocks = money / stockprice;
		
		System.out.println("Buy " + numberOfStocks + " shares of stock.");
		
		int cdDeposit = money - (numberOfStocks * stockprice);
		
		System.out.println("Invest $" + cdDeposit + " in CD account.");
		
	}

}
