package edu.neu.csye7374;

public class BullStrategy implements StockPriceStrategy {

	@Override
	public double calculateNewPrice(double currentPrice) {
		return currentPrice + currentPrice*0.2 ;
		
		
	}

}
