package constructor;

/*
 * 생성자 generate 기능 사용하기
 * */

public class Ex03 {
	public static void main(String[] args) {
		Board board = new Board();
		Board board2 = new Board(1,"제목","내용","작성자");
		
		
	}

}

class Board {
	int no;
	String title;
	String content;
	String writter;
	
	public Board() {
		super();
	}

	public Board(int no, String title, String content, String writter) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writter = writter;
	}
	
	
	// source 메뉴 = generate constructor..
	
}
