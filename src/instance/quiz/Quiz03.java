package instance.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		Book book1 = new Book(); 
		book1.title = "자바프로그래밍";  //도트 연산자를 통해 객체에 접근
		book1.price = 20000;
		book1.company = "한빛컴퍼니";
		book1.page = 500;
		book1.showBookInfo();

		System.out.println("인스턴스 주소: " + book1);
		System.out.println();

		Book book2 = new Book();
		book2.title = "스프링";
		book2.price = 15000;
		book2.company = "한빛컴퍼니";
		book2.page = 500;
		book2.showBookInfo();

		System.out.println("인스턴스 주소: " + book2);

	}

}

class Book {

	String title;
	int price;
	String company;
	int page;

	public void showBookInfo() {

		System.out.println("제목: " + title + " 가격: " + price + " 출판사: " + company + " 페이지수: " + page);
	}

}
