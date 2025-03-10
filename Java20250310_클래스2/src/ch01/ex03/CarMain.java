package ch01.ex03;

import java.util.Random;

public class CarMain {
	int speed; // 인스턴스
	void run() {
		speed = 100;
	}
	public static void main(String[] args) {
			//정적
		Car car1 = new Car();	
		Car car2 = new Car();	
		Car car3 = new Car();	
		Car car4 = new Car();	
		Car car5 = new Car();	
		
		CarMain car = new CarMain();
		car.speed = 200; //인스턴스 멤버를 사용하기 위해서는 객체 생성이 필요
		
	}

}
