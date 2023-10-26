package constructor.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.bookTitle = "스프링부트";
		book1.bookPrice = 30000;
		book1.bookCompany = "한빛출판사";
		book1.bookPage = 300;

		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300); // book2 생성과 동시에 멤버변수도 모두 입력

		System.out.println(book1.bookCompany);
		System.out.println(book2.bookCompany);
	}

}

class Book {
	String bookTitle; // 생성자를 만들기 전에 속성을 가장 먼저 정의해야 함.
	int bookPrice;
	String bookCompany;
	int bookPage;

	public Book() {
		System.out.println();
	}

	public Book(String bookTitle, int bookPrice, String bookCompany, int bookPage) { // 매개변수 순서만 달라도 다르게 인식 가능.
		super();
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.bookCompany = bookCompany;
		this.bookPage = bookPage;
	}

}
