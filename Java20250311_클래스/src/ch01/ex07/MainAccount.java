package ch01.ex07;
//싱글톤 패턴
public class MainAccount {

	public static void main(String[] args) {
		
		Account acc  = Account.getInstance();
		
		acc.setBalance(100);
		
		System.out.println(acc.getBalance());

		
		Account acc2 = Account.getInstance();
		System.out.println(acc2.getBalance());
		
		
		
		if(acc==acc2) {
			System.out.println("같은 ac 객체입니다");
		}else {
			System.out.println("다른 ac 객체입니다");
		}
		
	}

}
