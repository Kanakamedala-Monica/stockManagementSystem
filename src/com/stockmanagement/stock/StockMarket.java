package com.stockmanagement.stock;
import java.util.*;

public class StockMarket {
	private Stock[] stocks;
    private int numStocks;
    
    public StockMarket(int maxSize) {
        stocks = new Stock[maxSize];
        numStocks = 0;
    }
    
    public void addStock(Stock stock) {
        if (numStocks < stocks.length) {
            stocks[numStocks] = stock;
            numStocks++;
            System.out.println("Stock added successfully.");
        } else {
            System.out.println("Stock market is full. Cannot add more stocks.");
        }
    }
    
    public Stock getStockBySymbol(String symbol) {
        for (int i = 0; i < numStocks; i++) {
            if (stocks[i].getSymbol().equals(symbol)) {
                return stocks[i];
            }
        }
        return null; // Stock not found
    }

    public void updateStock(Stock updatedStock) {
        for (int i = 0; i < numStocks; i++) {
            if (stocks[i].getSymbol().equals(updatedStock.getSymbol())) {
                stocks[i] = updatedStock;
                System.out.println("Stock updated successfully.");
                return;
            }
        }
        System.out.println("Stock not found. Update failed.");
    }
    
    public void removeStock(String symbol) {
        for (int i = 0; i < numStocks; i++) {
            if (stocks[i].getSymbol().equals(symbol)) {
                // Shift remaining stocks to fill the gap
                for (int j = i; j < numStocks - 1; j++) {
                    stocks[j] = stocks[j + 1];
                }
                numStocks--;
                System.out.println("Stock removed successfully.");
                return;
            }
        }
        System.out.println("Stock not found. Removal failed.");
    }
    
    public void listAllStocks() {
        System.out.println("Stocks in the market:");
        for (int i = 0; i < numStocks; i++) {
            System.out.println(stocks[i]);
        }
    }
    
    public Stock findStockWithMinPricePerShare() {
        if (numStocks == 0) {
            return null; // No stocks available
        }

        Stock minPriceStock = stocks[0];
        for (int i = 1; i < numStocks; i++) {
            if (stocks[i].getPricePerShare() < minPriceStock.getPricePerShare()) {
                minPriceStock = stocks[i];
            }
        }
        return minPriceStock;
    }
    
 // Sort Stocks by Price Per Share
    public void sortStocksByPricePerShare() {
        Arrays.sort(stocks, 0, numStocks, Comparator.comparingDouble(Stock::getPricePerShare));
        System.out.println("Stocks sorted by price per share.");
    }
    
    public Stock getStockByCompanyName(String company) {
        for (int i = 0; i < numStocks; i++) {
            if (stocks[i].getCompanyName().equalsIgnoreCase(company)) {
                return stocks[i];
            }
        }
        return null; // Stock not found
    }
}
