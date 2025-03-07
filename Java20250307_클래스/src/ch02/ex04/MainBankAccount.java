package ch02.ex04;

public class MainBankAccount {

	public static void main(String[] args) {

	BankAccount b1 = new BankAccount("홍길동", 10000);
	b1.deposit(10000);
	b1.withdraw(30000); //잔액부족, 처리 안됨
	b1.withdraw(2000);
	System.out.println(b1.getBalance());
	}

}
