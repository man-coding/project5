package method;

public class Ex03 {

	// 1~10까지 출력하는 함수 선언
	public static void printTen() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) { // 끝나는 순간 메모리 소멸, 프로그램 종료.
		printTen(); // 함수 호출
		printTen();
		printTen(); // 함수로 묶어놨기 때문에 똑같은 작업을 간결하게 할 수 있는 효과.

	}

}
