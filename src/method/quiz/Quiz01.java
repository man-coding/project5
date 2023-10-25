package method.quiz;

/*
 * 사칙연산을 수행하는 함수를 만들고 호출하세요
 * 2와 5를 입력
 * */

public class Quiz01 {

	public static void arithmetic(int n1, int n2) {

		int sum = n1 + n2;
		int minus = n1 - n2;
		int multiple = n1 * n2;
		int per = n1 / n2;
		int rem = n1 % n2;

		System.out.println(sum);
		System.out.println(minus);
		System.out.println(multiple);
		System.out.println(per);
		System.out.println(rem);
		System.out.println();

	}

	public static void main(String[] args) {

		arithmetic(27, 13);
		arithmetic(5, 2);

	}

}
