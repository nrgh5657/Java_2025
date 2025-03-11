package ch01.ex09;

public class A {
	private String name;
	
	A(String name){
	this.name= name;
	}
	void test() {
		System.out.println("A()");
	}
}

class B extends A{
	private String adress;
	
	B(String name, String adress){
	super(name);	
	this.adress = adress;
	}
	@Override
	void test() {
		System.out.println("B()");
	}
}

class C extends B{
	private int age;

	C(String name, String adress, int age){
	super(name, adress);
	this.age= age;
	}
	@Override
	void test() {
		System.out.println("C()");
	}
}