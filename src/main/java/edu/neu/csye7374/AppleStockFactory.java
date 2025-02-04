package edu.neu.csye7374;

public class AppleStockFactory implements AbstractFactory {
    @Override
    public StockAPI createStock(String id, String name, Double price, String description) {
        return new AppleStock(id, name, price, description, null);
    }
    public static AppleStockFactory getInstance() {
        return new AppleStockFactory();
    }
}
