package ex05;

public abstract class TV {
 /*
  * 클래스 내부에 추상클래스가 1개이상
  * 존재하면 그 클래스는 추상클래스이다
  */

	boolean power;
	int volume;
	TV(){
		power = false;
		volume = 0;
	}

	abstract void powerOn() ;
		
	
	abstract void powerOff();
		
	
	
	abstract void volumeUp() ;
		
	
	abstract void volumeDown() ;
		
	
}
