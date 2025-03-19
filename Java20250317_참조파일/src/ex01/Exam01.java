package ex01;

public class Exam01 {

	public static void main(String[] args) {

		String name = "여행";
		System.out.println(name);
		System.out.println(name.length());
		
		String temp = name;
		name = "영화";
		System.out.println(name);
		System.out.println(name.length());
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		
		System.out.println(name1.charAt(1));
		
		String old1 = "자바프로그래밍프로";
		String new1 = old1.replace("자수", "JAVA");
		System.out.println(new1);
		System.out.println(old1);
		System.out.println(old1.indexOf("프"));
		System.out.println(old1.lastIndexOf("프"));
		
		String board = "번호, 제목, 내용, 성명";
		board.split(", ");
		String [] board1 = board.split(", ");
		System.out.println(board1[0]);
		System.out.println(board1[1]);
		System.out.println(board1[2]);
		System.out.println(board1[3]);
	
		String[] str1 = new String[3];
		
		str1[0] = "java";
		str1[1] = "java";
		str1[2] = new String("java");
		
		System.out.println(str1[0]==str1[1]);
		System.out.println(str1[0]==str1[2]);
		System.out.println(str1[0].equals(str1[1]));
		
		int[]intArray = {1,2,3};
		int[]intNewArray = new int[5];
		for(int i = 0; i<intArray.length; i++) {
			intNewArray[i] = intArray[i];
			
		}
		for(int i=0; i<intNewArray.length; i++) {
			System.out.print(intNewArray[i] + ", ");
		}
		
		
		
		
	}

}
