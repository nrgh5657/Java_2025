package ch02.sec01;

public class VariableEx2 {

	public static void main(String[] args) {
	   
	   int hour = 3;
	   
	   int minute = 5;
	 //hour = 15;
	 //hour = hour + 5;   
	   
	   System.out.println(hour + "시간 " + minute + "분");
			   
       int totalMinute = (hour*60) + minute;
       
       System.out.println("총 " + totalMinute + "분");
       
	
	
	}

}
/* 변수명 작성
   * 영문자, 숫자, _ -> 단, 숫자가 맨 앞에 올 수는 없다
   * 변수명 첫글자는 소문자로 기입한다
   */
   
  // 국어점수 -> korSocre (카멜표기법) -> 두 단어가 조합된 경우 두번째 단어는 대문자
  // 국어점수 -> kor_score (스네이크표기법)
 // 대문자 변수-> 갑을 바꾸지마, final 변수 -> 중복해서 변수명을 사용할수 없게 함

