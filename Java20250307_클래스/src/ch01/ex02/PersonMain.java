package ch01.ex02;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		// 이름 나이 전화번호만 입력하고,
		//메소드 호출해서 출력
		Person p1 = new Person();
		
		p1.name = "차OO";
		p1.age = 28;
		p1.phone = "010-0000-1111";
		
		p1.이름출력(p1.name);
		p1.나이출력(p1.age);
		p1.전화번호출력(p1.phone);
	}

}
