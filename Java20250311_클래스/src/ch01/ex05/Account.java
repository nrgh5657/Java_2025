package ch01.ex05;

public class Account {
	
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	

	
	void setBalance(int balance) {
		if (balance <= MAX_BALANCE && balance >= MIN_BALANCE) {
			this.balance = balance;  
		}
	}
	
	int getBalance() {
		return balance;
	}

	
}
