package edu.neu.csye7374;

public class BearStrategy implements StockPriceStrategy {

	@Override
	public double calculateNewPrice(double currentPrice) {
		// TODO Auto-generated method stub
		return currentPrice - currentPrice*0.2;
	}

}
