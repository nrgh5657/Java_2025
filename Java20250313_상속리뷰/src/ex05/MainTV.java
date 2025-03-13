package ex05;

public class MainTV {
	
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		TV tv2 = new SonyTV();
		tv2.powerOn();
		tv2.powerOff();
		tv2.volumeUp();
		tv2.volumeDown();
	}
}
