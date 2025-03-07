package ch06.ex07.exam06;

public class MainCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.displayInfo();
		Car car2 = new Car("현대");
		car2.displayInfo();
		Car car3 = new Car("기아", "K9");
		car3.displayInfo();
		
		System.out.println();
		
		
		Car car = new Car("기아자동차", "K8", 2023);
		car.startEngine();
		
		car.setBrand("기아자동차");
		car.setModel("K5");
		car.setYear(2020);
		System.out.println();
		car.startEngine();
		car.displayInfo();
		System.out.println();
		
	
	}

}
