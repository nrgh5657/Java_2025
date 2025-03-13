package ch01.ex01;

public class A {
	String name;

	A(String namer) {
		this.name = name;
	}
	
	A(){}
	
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
	
	void funcC(){
		System.out.println("funcC()");
		
	}
}