package ch01.ex05;
/*
 *static 정적 <===> 인스턴스
 * 인스턴스 변수(멤버변수), 인스턴스 메소드(멤버메소드)
 * 정적변수, 정적 메소드
 */

class Person {
	private String name;	
	private int age;
	
	static int count;
	static void func() {
		System.out.println("정적메소드 func()");
		count ++;
		//age++;
		//eat();
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	String displayInfo() {
		return name + " : " + age;
	}
	
	void run() {
		count++;
		func();
		eat();
		age++;
		
		
		System.out.println("run.......");
		
	}
	void eat() {
		System.out.println("eat.......");
	}
	
}
