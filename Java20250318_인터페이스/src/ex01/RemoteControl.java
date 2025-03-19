package ex01;

public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	/*
	 * interface 상수
	 * 멤버변수 생성 불가
	 * 정적변수만 생성 가능
	 */
//추상메소드 
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제함니다");
		}
	}
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교체합니다");
	}

}
