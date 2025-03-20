package ex09;

class Container <Q, W> {
    private Q key;
    private W value;

    // Method to set both key and value
    public void set(Q key, W value) {
        this.key = key;
        this.value = value;
    }

    // Method to get the key
    public Q getKey() {
        return key;
    }

    // Method to get the value
    public W getValue() {
        return value;
    }
}


	


public class GenericCheck2 {

	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String,String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();

	}

}
