package ch06.ex07.exam04;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1.getCompany());
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println(car2.getCompany());
		System.out.println(car2.getModel());
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println(car3.getCompany());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("comapny: " + car4.getCompany());
		System.out.println("model: " +  car4.getModel());
		System.out.println("color: " + car4.getColor());
		System.out.println("maxSpeed: " + car4.getMaxSpeed());
		
		System.out.println();
	    
		Car car5 = new Car();
	    car5.setModel("중형 세단");
	    car5.setColor("흰색");
	    car5.setMaxSpeed(250);
	    System.out.println(car5.getModel());
	    System.out.println(car5.getColor());
	    System.out.println(car5.getMaxSpeed());
	}


}
