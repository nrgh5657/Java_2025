package ex07;

import java.text.DecimalFormat;

public class Product {

	String name;
	int balance;
	int price;
	
	Product(){
	this("듀크인형", 5, 10000);	
	}
	
	Product(String name, int balance, int price){
		this.name =name;
		this.balance = balance;
		this.price = price;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		return name + " " + balance + " " + df.format(price) + "원";
	}
	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int getPrice() {
		return price;
	}
	

	 
	
}
