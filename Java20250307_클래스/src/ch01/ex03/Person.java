package ch01.ex03;

public class Person {
	private String name ; // private -> 클래스 내부에서만 사용, 외부에서 접근 X, 변수 통제
	private String phone ;
	private int age;
	/*생성자
	 * 생성자 : 값초기화
	 */
	
	//디폴트 생성자
	public Person(String n, int a, String p) {
	name = n;
	
	if(a>=0 && a<=120) {
		age = a;
	}else { 
		age = 1;
	}

	
	phone  = p;
	}
	public Person() {
		System.out.println("void Person()");
	}

	// 메소드 인스턴스 메소드
	void 나이출력(){
		System.out.println("나이: " + age);
	}
	void 전화번호출력(){
		System.out.println("전화번호: "+ phone);
		
	}
	void 이름출력(){
		System.out.println("이름은: " + name);
	}
}
