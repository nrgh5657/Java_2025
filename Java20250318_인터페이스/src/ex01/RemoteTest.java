package ex01;

public class RemoteTest {
	public static void main(String[] args) {
	
		RemoteControl rc = new Televisoin();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		rc.setMute(true);
		rc.setMute(false);
		
		rc = new Radio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		rc.setMute(true);
		rc.setMute(false);
		
		
		System.out.println("최대볼륨: " + RemoteControl.MAX_VOLUME);
		System.out.println("최소볼륨: " +  RemoteControl.MIN_VOLUME);
		
		System.out.println(A.number);
		System.out.println(B.number);
		
		RemoteControl.changeBattery();
		
	}

}
class A{
	public static int number =100;
}

class B{
	public static int number =50;
}
