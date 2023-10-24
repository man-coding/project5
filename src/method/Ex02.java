package method;

/*
 * 
 * */

public class Ex02 {

	public static int add(int n1, int n2) {
		
		int result = n1 + n2;
		return result;

	}

	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 5;
		int sum = add(num1, num2);
		
		int num3 = 5;
		int num4 = 5;
		int sum2 = add(5, 5);
		
		int num5 = 10;
		int num6 = 10;
		int sum3 = add(10, 10);
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num3 + " + " + num4 + " = " + sum2);
		System.out.println(num5 + " + " + num6 + " = " + sum3);
	}

}
