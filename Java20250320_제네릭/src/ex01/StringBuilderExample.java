package ex01;

public class StringBuilderExample {

	public static void main(String[] args) {

		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
		
		String data2 = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 5)
				.toString();
		System.out.println(data2);
		
		String data3 = new StringBuffer()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 5)
				.toString();
		System.out.println(data3);
		
		
		
	}

}
