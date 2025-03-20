package ex01;

public class BoxExample {

	public static void main(String[] args) {

			
		Integer obj = 100;
		System.out.println(obj);
		
		int value = obj;
		System.out.println(value);
		
		int result = obj + 100;
		System.out.println(result);		
		
		int i = 10;
		int j = 5;
		int k = 20;
		int l = 30;
		
		int max = Math.max(Math.max((Math.max(i, j)),k),l);
		System.out.println(max);
		
	}

}
