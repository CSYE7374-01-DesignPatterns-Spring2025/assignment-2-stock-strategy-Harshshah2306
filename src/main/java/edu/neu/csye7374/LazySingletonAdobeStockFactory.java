package edu.neu.csye7374;

public abstract class LazySingletonAdobeStockFactory implements AbstractFactory {
    private static LazySingletonAdobeStockFactory instance = null;

    private LazySingletonAdobeStockFactory() {
    }

    public static LazySingletonAdobeStockFactory getInstance() {
        return new LazySingletonAdobeStockFactory() {
        };
    }

    @Override
    public StockAPI createStock(String id, String name, Double price, String description) {
        return new AdobeStock(id, name, price, description, null);
    }
}
