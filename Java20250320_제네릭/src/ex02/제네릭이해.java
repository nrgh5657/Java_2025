package ex02;

import lombok.Getter;
import lombok.Setter;

class Apple{
	@Override
	public String toString() {
		return " I am an apple";
	}
}

class Orange{
	@Override
	public String toString() {
		return " I am an orange";
	}
}	
class appleBox{
	private Apple ap;

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
	
}
class orangeBox{
	private Orange op;

	public Orange getOp() {
		return op;
	}

	public void setOp(Orange op) {
		this.op = op;
	}
}


public class 제네릭이해 {
	
	public static void main(String[] args) {
	appleBox aBox = new appleBox();	
	orangeBox oBox = new orangeBox();
	
	aBox.setAp(new Apple());
	oBox.setOp(new Orange());
	Apple ap = aBox.getAp();
	System.out.println(ap);
	
	Orange op = oBox.getOp();
	System.out.println(op);
	}
}
