package method.quiz;

/*
 * */

public class Quiz05 {

	public static void per(int n1, int n2) { //"이라면" -> 같다 라고 생각

		if (n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다");
			return;  // 함수 강제 종료할 때는 return 씀.
		}
		int result = n1 / n2;  // 조건을 먼저 판단한 뒤 계산을 하는 식으로 배치해야 함.
		System.out.println(result);
	}

	public static void main(String[] args) {

		per(10,0);
		per(20,3);

	}

}
