package ch01.ex04;
/*
 *setter, getter 
 */

class Person {
	private String name;	
	private int age;
	
	
	void setName(String name) {
	 this.name =name;	
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
	this.age = age;
	}
	
	Person(){
	this("남산", 1);
//	name = "남산";
//	age = 1;		
	}
	
	Person(String name){
		this(name, 1);
//		this.name = name;
//		age = 1;
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	String displayInfo() {
		return name + " : " + age;
	}
	
	void run() {
		
		System.out.println("run.......");
		
	}
	void eat() {
		System.out.println("eat.......");
	}
	
}
