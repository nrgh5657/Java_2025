package ch01.ex08;

public class A {

	private String name;
	private int age;
	A(){}
	
	A(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void funcA() {
		System.out.println("funcA()");
	
	}
	void info() {
		System.out.println(name);
		System.out.println(age);
	}
}

class B extends A{
	private String address;
	B(){}
	
	B(String name, int age, String address){
		super(name, age);
		this.address = address;
	}
	
	
	void funcB() {
		System.out.println("funcB()");
	}
	@Override //상위 클래스 있는 메소드를 재정의 하고있다
	void info() {
		System.out.println("B class");
	}
	void infoB() {
		info();
		System.out.println(address);
	}
	

	
}