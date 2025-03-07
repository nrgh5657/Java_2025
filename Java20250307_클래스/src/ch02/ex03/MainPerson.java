package ch02.ex03;

public class MainPerson {

	public static void main(String[] args) {

		Person p1 = new Person("홍길동", 20);
		
		String msg = p1.introduce();
		System.out.println(msg);
		System.out.println(p1.introduce());
	}

}
