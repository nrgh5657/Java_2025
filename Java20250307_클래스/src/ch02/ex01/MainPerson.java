package ch02.ex01;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("차OO");
	
		
//		p1.name = "차OO"; - > 멤버변수는 private 이기 때문에 외부 접근 불가
		
//		p1.run(); // 외부에서 접근 불가
		p1.eat();
		p1.sleep();
	
		Person p2 = new Person("차OO", 20, "010-1111-2222");
		
		p2.eat();
		
		
//		Person p3 = new Person();
		p2.setName("까미");
		p2.eat();
		p2.setAge(100);
		
		String name = p2.getName();
		int age = p2.getAge();
		System.out.println(name);
		System.out.println(age);
		
	
	
	
	}

}
