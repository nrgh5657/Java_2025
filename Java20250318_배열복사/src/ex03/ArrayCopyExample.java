package ex03;

public class ArrayCopyExample {

	public static void main(String[] args) {

	/*	int[]oldIntArray = new int[] {10,20,30,40,50};
		int[]oldIntArray2 = new int[5];
		oldIntArray2[0] = 10;
	*/	
		int []oldIntArray = {1,2,3,};
		System.out.println(oldIntArray.length);

		int[] newIntArray = new int[6];
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
			
		}
		for(int i = 0; i<newIntArray.length; i++)
		System.out.print(newIntArray[i] + " ");
		System.out.println();
		int []intArray = new int [10];
	//									새 배열 새배열 시작 인덱스			
		System.arraycopy(newIntArray, 0, intArray, 0, newIntArray.length);
					//	원본배열      원본 배열             복사 항목수
					//			  복사 시작 위치
		for(int i=0; i<intArray.length; i++)
			System.out.print((intArray[i] + " "));
		System.out.println();

		for(int i:intArray)
			System.out.print(i + " ");
	}
	

}
