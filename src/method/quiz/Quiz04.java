package method.quiz;

public class Quiz04 {

	public static int substract(int n1, int n2) {

		if (n1 < n2) {
			return -999;
		}
		int result = n1 - n2;
		return result;
	}

	public static void main(String[] args) {

		int num1 = 31;
		int num2 = 20;
		int result = substract(num1, num2);
		System.out.println(result);

	}

}
