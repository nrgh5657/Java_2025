package ch02.ex02;

public class SwitchExam02 {

	public static void main(String[] args) {
/*
 * 학점 계산
 * 90 : A
 * 80 : B
 * 70 : C
 * 60 : D
 * 59이하 F
 */
		int grade = 70;
		
	switch(grade/10) {
	case 10:
		System.out.println("A");
		break;
	case 9:
		System.out.println("A");
		break;
	case 8:
		System.out.println("B");
		break;
	case 7:
		System.out.println("C");
		break;
	case 6:
		System.out.println("D");
		break;
	default : 
		System.out.println("F");
	}
     System.out.println("종료");		
		
	}

}
