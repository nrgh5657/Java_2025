package ex01;

public class RentalTV extends TV implements Rentable{

	int price;
	
	RentalTV(){
		
	}
	RentalTV(int price, String model, int size, int channel){
		super(model, size, channel);
		this.price = price;
	}
	
	public void play() {
		System.out.printf("대여 TV채널 %d번의 프로를 플레이 합니다\n", getChannel());
	}
	
	public void rent() {
		System.out.printf("%s모델의 상품을 대여합니다 %d원을 지불해주세요\n", getModel(), price);
	}
	public String toString() {
		return String.format("판매상품정보 : 모델명(%s), 가격(%d원), 크기(%d)",  getModel(), price, getSize());
		
	}
}
