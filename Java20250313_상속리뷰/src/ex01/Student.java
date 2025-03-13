package ex01;

public class Student extends Person {
/*	private String name;
	private int age;
	private String gender;
*/	
	private String schoolNmae;
	private int grade; //학년
	
	void study() {}
	
	void introduce() {
		System.out.println("안녕하세요. 저는 " + schoolNmae + "에 다니는 " + grade + "학년 " 
	+ getName() + "입니다" );
	}
}
