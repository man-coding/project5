package zpractice;

public class practice03 {

	public static int method(int n1, int n2) {

		
		if (n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다");
		}
		int result = n1 / n2;
		return result;
	}

	public static void main(String[] args) {

		method(10, 0);

	}

}
