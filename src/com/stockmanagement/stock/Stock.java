package com.stockmanagement.stock;

public class Stock {
	private String symbol;
    private String companyName;
    private double pricePerShare;
    private int numberOfShares;
	public Stock(String symbol, String companyName, double pricePerShare, int numberOfShares) {
		super();
		this.symbol = symbol;
		this.companyName = companyName;
		this.pricePerShare = pricePerShare;
		this.numberOfShares = numberOfShares;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", companyName=" + companyName + ", pricePerShare=" + pricePerShare
				+ ", numberOfShares=" + numberOfShares + "]";
	}
    

}
