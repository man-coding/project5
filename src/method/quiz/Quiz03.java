package method.quiz;

public class Quiz03 {

	public static int hap(int n1, int n2) {
		int result = 0;

		for (int i = n1; i <= n2; i++) {

			result = result + i;

		}
		return result; // return 키워드는 함수 밖에 명시해주어야 함.

		// int sum = n1 + n2;
		// int num = n1;
		// int sum1 = 0;
		// while (num <= n2) {
		// sum1 = sum1 + num;
		// num++;
		// }
		// System.out.println(sum);
		// System.out.println(sum1);
	}

	public static void main(String[] args) {
		
		int result1 = hap(5, 10); // 함수 호출
		System.out.println(result1);
		
		// int result = sum(1,9);
		// System.out.println(result);
	}

}
