package com.stockmanagement.main;
import com.stockmanagement.stock.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockMarket stockMarket = new StockMarket(10); // Set the maximum size

        // Example usage:
        Stock stock1 = new Stock("AAPL", "Apple Inc.", 150.0, 100);
        Stock stock2 = new Stock("GOOGL", "Alphabet Inc.", 2500.0, 50);

        stockMarket.addStock(stock1);
        stockMarket.addStock(stock2);

        Stock retrievedStock = stockMarket.getStockBySymbol("AAPL");
        if (retrievedStock != null) {
            System.out.println("Retrieved stock: " + retrievedStock);
        } else {
            System.out.println("Stock not found.");
        }

        stockMarket.updateStock(new Stock("AAPL", "Apple Inc.", 155.0, 110));
        stockMarket.listAllStocks();
	}

}
