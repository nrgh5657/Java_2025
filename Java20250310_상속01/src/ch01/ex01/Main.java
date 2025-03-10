package ch01.ex01;

class K {
	
}

class A{

	String name;
	int age;
	A(){	
	
	}
	A(String name, int age){
	this.name = name;
	this.age = age;
	}
	void run() {}
	void eat() {}
}	
// B클래스가 상위클래스인 A클래스를 상속하겠다
	class  B extends A{
	String id;
	B(){
		
	}
	B(String name, int age, String id){
		super(name, age);
		this.id = id;
	}
}
				//다중 상속 불가
	final class C extends B{
	String pw;
	C(){
		
	}
	C(String name, int age, String id, String pw){
		super(name, age, id); //super() +> 상위 클래스 생성자 호출
		this.pw = pw;
	}
	
	void displayInfo() {
		System.out.println("A class : " + name);
		System.out.println("A class : " + age);
		System.out.println("B class : " + id);
		System.out.println("C class : " + pw);
	}
}
//class D extends C{
	
//}
public class Main {

	public static void main(String[] args) {
		
	C c = new C("홍길동", 20, "qwer1234", "1234");
	c.displayInfo();
	}

}
