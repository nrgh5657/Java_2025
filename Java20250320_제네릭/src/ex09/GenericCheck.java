package ex09;



class Container<T> {  
    private T value;   
    
    // 값 설정 메서드
    public void set(T value) {
        this.value = value;
    }

    // 값 가져오는 메서드
    public T get() {
        return value;
    }
}


public class GenericCheck {
	
	public static void main(String[] args) {
	Container<String> container1 = new Container<String>();
	container1.set("홍길동");
	String str = container1.get();
	
	Container<Integer> container2 = new Container<Integer>();
	container2.set(6);
	int value = container2.get();
	System.out.println(container1.get());
	System.out.println(container2.get());
	}
}
