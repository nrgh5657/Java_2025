package ch01.ex02;

public class A {
	String name;

	A(String namer) {
		this.name = name;
	}
	
	A(){}
	void test() {
		System.out.println("A class");
	}
	
	void funcA() {
		System.out.println("funcA()");
	}
}

class B extends A{
	String address;
	
	B(String n2, String address){
		super(n2);
		this.address = address;
	}
	
	B(){}
	@Override
	void test() {
		System.out.println("B class");
	}
	
	void funcB() {
		System.out.println("funcB()");
		
	}
}

class C extends B{
	int age;
	
	C(String n, String a, int age){
		super(n ,a);
		this.age = age;
	}
	
	C(){}
	@Override
	void test() {
		System.out.println("C class");
	}
	
	void funcC(){
		System.out.println("funcC()");
		
	}
}