package ch01.ex03;

public class PersonMain {

	public static void main(String[] args) {

		// 이름 나이 전화번호만 입력하고,
		//메소드 호출해서 출력
		/*객체 생성 -> 생성자 탐색 -> 생성자 X -> 디폴트 생성자 자동생성
		*					  -> 생성자 O -> 디폴트 생성자 생성 x
		*/		
		Person p1 = new Person("차OO", 28, "010-0000-1111");

		
	p1.나이출력();
	p1.이름출력();
	p1.전화번호출력();
	System.out.println();
	
	Person p2 = new Person("홍길동", 2000, "1111-2222");
	p2.나이출력();
	p2.이름출력();
	p2.전화번호출력();
	}

}
