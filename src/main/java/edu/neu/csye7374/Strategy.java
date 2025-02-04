package edu.neu.csye7374;

public class Strategy {
	public static void startStrategy() {
		StockPriceStrategy bullStrategy = new BullStrategy();
        StockPriceStrategy bearStrategy = new BearStrategy();

        AdobeStock adobeStock = new AdobeStock("1", "Adobe", 120.00, "This is adobe Stock", bullStrategy);
        AppleStock appleStock = new AppleStock("2", "Apple", 150.00, "This is Apple Stock", bearStrategy);

        System.out.println("Initial Stock Prices:");
        System.out.println("Adobe Stock Price: " + adobeStock);
        System.out.println("Apple Stock Price: " + appleStock);

        adobeStock.updatePrice();
        appleStock.updatePrice();

        System.out.println("Updated Stock Prices:");
        System.out.println("Adobe Stock Price: " + adobeStock);
        System.out.println("Apple Stock Price: " + appleStock);
        
        System.out.println("Changing Stock Strategy");
        adobeStock.setPriceStrategy(bearStrategy);
        appleStock.setPriceStrategy(bullStrategy);
        
        System.out.println("Updated Stock Prices after changing the Strategy:");
        adobeStock.updatePrice();
        appleStock.updatePrice();
        System.out.println("Adobe Stock Price: " + adobeStock);
        System.out.println("Apple Stock Price: " + appleStock);
        
   
	}
}
