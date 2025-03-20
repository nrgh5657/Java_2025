package ex07;
/*
 * T : 타입인자
 * T extends A -> T에게 전달되는 대상은 A이거나 A 하위클래스만 전달 가능 ..제한을 주겠다
 * 
 */



//    Number 이거나 하위 클래스(AtomicInteger, AtomicLong, BigDecimal, BigInteger, Byte, Double, DoubleAccumulator, DoubleAdder, Float, Integer, Long, LongAccumulator, LongAdder, Short)
class Box<T extends Number>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}


public class 제네릭이해 {
	
	public static void main(String[] args) {
		Box<Integer>iBox = new Box<>();
		iBox.setObj(10);
		
		Box<Double>dBox = new Box<>();
		dBox.setObj(10.2);

		
//		Box<String>sBox = new Box<>(); -> 안된다

		
		
		
	
	
	}
}
