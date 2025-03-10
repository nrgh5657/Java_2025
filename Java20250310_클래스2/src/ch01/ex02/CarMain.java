package ch01.ex02;

import java.util.Random;

public class CarMain {

	public static void main(String[] args) {

		Car.runStatic();
		System.out.println(Car.companyState); 
		System.out.println();	
		
		Car car1= new Car();
		car1.runStatic();
		car1.displayInfo();
		System.out.println();
		
		Car car2 = new Car("기아", "K8", "검정", 200);
		car2.displayInfo();
		System.out.println();
		car2.runStatic();
		
		Random random = new Random();
		int num = (int)(random.nextInt()*45)+1; //인스턴스 메소드
		int num2= (int)(Math.random()*45)+1; // 정적 메소드
	
	
		
	}

}
