package com.stockmanagement.main;
import com.stockmanagement.stock.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StockMarket stockMarket = new StockMarket(10); // Set the maximum size

        // Example usage:
        Stock stock1 = new Stock("ADB", "Aditya birla", 150.0, 100);
        Stock stock2 = new Stock("TM", "tech mahindra", 2500.0, 50);
        Stock stock3 = new Stock("MSFT", "Microsoft Corp.", 280.0, 150);

        stockMarket.addStock(stock1);
        stockMarket.addStock(stock2);
        stockMarket.addStock(stock3);

        stockMarket.updateStock(new Stock("ADB", "Aditya birla", 155.0, 110));
        stockMarket.listAllStocks();
        
        Stock minPriceStock = stockMarket.findStockWithMinPricePerShare();
        if (minPriceStock != null) {
            System.out.println("Stock with the minimum price per share: " + minPriceStock);
        } else {
            System.out.println("No stocks available.");
        }
        
        stockMarket.sortStocksByPricePerShare();
        stockMarket.listAllStocks();
        Stock company=stockMarket.getStockByCompanyName("tech mahindra");
        System.out.println(company);
        Stock symbol=stockMarket.getStockBySymbol("MSFT");
        System.out.println(symbol);*/
		
		StockMarket stockMarket = new StockMarket(10); // Set the maximum size
		Scanner sc = new Scanner(System.in);
		
        System.out.println("\nStock Market Management System :\n1. Add Stock\n2. Get Stock by Symbol\n3. Update Stock\n4. Remove Stock\n5. List All Stocks\n6. Find Stock with Minimum Price Per Share\n7. Sort Stocks by Price Per Share\n8. Get stock by company name\n9. Exit");
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            Stock stock;

            switch (choice) {
                case 1:
                    System.out.print("Enter stock symbol: ");
                    String symbol = sc.nextLine();
                    System.out.print("Enter company name: ");
                    String companyName = sc.nextLine();
                    System.out.print("Enter price per share: ");
                    double pricePerShare = sc.nextDouble();
                    System.out.print("Enter number of shares: ");
                    int numberOfShares = sc.nextInt();
                    Stock newStock = new Stock(symbol, companyName, pricePerShare, numberOfShares);
                    stockMarket.addStock(newStock);
                    break;

                case 2:
                    System.out.print("Enter stock symbol to retrieve: ");
                    symbol = sc.nextLine();
                    stock = stockMarket.getStockBySymbol(symbol);
                    if (stock != null) {
                        System.out.println("Stock found: " + stock);
                    } else {
                        System.out.println("Stock not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter stock symbol to update: ");
                    symbol = sc.nextLine();
                    System.out.print("Enter new company name: ");
                    companyName = sc.nextLine();
                    System.out.print("Enter new price per share: ");
                    pricePerShare = sc.nextDouble();
                    System.out.print("Enter new number of shares: ");
                    numberOfShares = sc.nextInt();
                    Stock updatedStock = new Stock(symbol, companyName, pricePerShare, numberOfShares);
                    stockMarket.updateStock(updatedStock);
                    break;

                case 4:
                    System.out.print("Enter stock symbol to remove: ");
                    symbol = sc.nextLine();
                    stockMarket.removeStock(symbol);
                    break;

                case 5:
                    stockMarket.listAllStocks();
                    break;

                case 6:
                    Stock minPriceStock = stockMarket.findStockWithMinPricePerShare();
                    if (minPriceStock != null) {
                        System.out.println("Stock with the minimum price per share: " + minPriceStock);
                    } else {
                        System.out.println("No stocks available.");
                    }
                    break;

                case 7:
                    stockMarket.sortStocksByPricePerShare();
                    break;
                    
                case 8:
                    System.out.print("Enter company name to retrieve stock: ");
                    String company = sc.nextLine();
                    stock = stockMarket.getStockByCompanyName(company);
                    if (stock != null) {
                        System.out.println("Stock found: " + stock);
                    } else {
                        System.out.println("Stock not found.");
                    }
                    break;
                    
                case 9:
                    sc.close();
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
        }
        }
	}

}
