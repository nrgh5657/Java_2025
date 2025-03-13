package ex07;

public class Book {

	private String title;
	private String author;
	private int price;
	
	Book(){
		this("자바의 정석", "남궁성", 27000);
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	String getBookInfo() {
		return " 책이름: " + title +", 저자: " + author + ", 가격: " + price;
	}
	
}
