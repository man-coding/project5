package zpractice;

public class practice02 {

	public static int max(int n1, int n2) {

		if (n1 > n2) {
			return n1;

		} else {
			return n2;
		}
	}

	public static void main(String[] args) {
		
		int m = max(10,5);
		
		System.out.println(m);
	}

}
