package ch01;

public abstract class Mobile {

	private String moblieName;
	private int batterySize;
	private String osType;
	
	Mobile(){}
	
	Mobile(String mobileNmae, int batterySize, String osType){
		this.moblieName = mobileNmae;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	public abstract void operate(int time);
	
	public abstract void charge(int time);

	public String getMoblieName() {
		return moblieName;
	}

	public void setMoblieName(String moblieName) {
		this.moblieName = moblieName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	} 
	
	
}
