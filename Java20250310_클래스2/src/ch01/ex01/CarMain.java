package ch01.ex01;

public class CarMain {

	public static void main(String[] args) {

		Car car1= new Car();
		
		car1.displayInfo();
		System.out.println();
		
		Car car2 = new Car("기아", "K8", "검정", 200);
		car2.displayInfo();
		System.out.println();
	
		Car car3 = new Car("현대", "소나타");
		car3.setColor("흰색");
		System.out.println(car3.getCompany());;
		car3.displayInfo();
		System.out.println();

	}

}
