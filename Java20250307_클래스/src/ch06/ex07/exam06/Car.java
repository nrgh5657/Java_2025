package ch06.ex07.exam06;


/*요구사항
 * 1. brand(브랜드), model(모델명), year(연식)을 필드로 가짐
 * 2. 생성자를 통해 brand, model, year 을 설정할수 있음
 * 3. startEngine() 메서드를 구현하여 "[brand] [model] 의 엔진이 시작되었습니다를 출력하도록 함
 * 4. displayInfo() 메서드를 구현하여 "자동차 정보: [year]년식 [brand][model]을 출력하도록 함
 * 5. main 메서드에서 Car 객체를 생성하고 strarEngine()과 dispayInfo()를 호출하여 실행 결과를 확인할것 
 * 
 * 
 * 
 */

public class Car {

	private	String brand;
	private String model;
	private int year;
	
	Car(){
		brand = "기아";
		model = "K8";
		year = 2024;
	}
	Car(String brand){
		this.brand = brand;
		model = "K8";
		year = 2024;
	}
	Car(String brand, String model){
		this.brand = brand;
		this.model = model;
		year = 2024;
	}
	

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	Car(String brand, String model, int year){
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void startEngine(){
		System.out.println("["+ brand +"] ["+ model +"]의 엔진이 시작되었습니다");
	}
	public void displayInfo(){
		System.out.println("자동차정보 : ["+year+"]년식 ["+brand+"] [" + model + "]의 엔진이 시작되었습니다");
	}

}
