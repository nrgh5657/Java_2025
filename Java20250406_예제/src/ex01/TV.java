package ex01;

public class TV {
	private String model;
	private int size;
	private int channel;
	
	TV(){
		
	}
	TV(String model, int size, int channel){
		this.model=model;
		this.size=size;
		this.channel=channel;
	}
	
	void channelUP() {
		channel ++;
		if(channel >10) {
			channel = 1;
		}
		
	}
	void channelDown() {
		channel --;
		if(channel<1) {
			channel=10;
		}
	}
	 
	public int getChannel() {
		return channel;
	}
	public String getModel() {
		return model;
	}
	public int getSize() {
		return size;
	}
	
	public String toString() {
	        return String.format("모델명(%s), 가격(가격정보없음), 크기(%d)", model, size);
	}
}

