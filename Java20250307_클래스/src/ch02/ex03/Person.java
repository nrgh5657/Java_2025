package ch02.ex03;

public class Person {

	private String name;
	private int age;

	public Person() {
		
	}
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	void setName(String n) {
		name = n;
	}
	void getName() {
		return;
	}
	void setAge(int a) {
		age = a;
	}
	void getAge() {
		return;
	}
	
	
	String introduce() {
	return "안녕하세요, " + "제 이름은 [" + name  + "]이고, [" + age + "]살입니다";

}
	
}
