package reference.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Book book1 = new Book("냉정과열정사이", 8000, "지음", 250);
		Book book2 = new Book("나무", 18000, "차오름", 450);
		Book book3 = new Book("기록의힘", 23000, "별빛출판사", 320);

		Member member = new Member(1, "민수", book1, book2, book3);
		member.method(book1);

		member.showInfo();
		book1.bookInfo();
	}

}

class Book {
	String title;
	int price;
	String company;
	int page;

	public Book(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	public void bookInfo() {
		System.out.println(title + " " + price + " " + company + " " + page);
	}

}

class Member {

	int memberID;
	String memberName;
	Book book1; //참조변수
	Book book2;
	Book book3;

	public Member(int memberID, String memberName, Book book1, Book book2, Book book3) {  //Book 타입으로 매개변수 정의됨.
		super();
		this.memberID = memberID;
		this.memberName = memberName;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
	
	public void method(Book book) {
		book.price = 100000;  //참조 타입의 매개변수는 원본 값에 영향을 준다
	}
	
	public void showInfo() {
		System.out.println(memberID + " " + memberName + " " + book1.title + " " + book2.title + " " + book3.title);
		
	}

}
