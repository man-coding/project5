package method.quiz;

/* 
 * 계산기 메소드를 만들고 호출하세요.
 * 두 수와 기능(문자 +-*)을 입력받아 연산을 수행하고, 결과를 출력하세요. ( 분기하는 조건식을 만들어야 함)
 * 예시) 1,5,+ : 6
 * 예시) 6,2,- : 4
 * 예시) 2,5,* : 10 
 * */ 

public class Quiz06 {  

	public static void cal(int n1, int n2, char oper) {

		int result;

		switch (oper) { 
		case '+': // if(oper == '+') 와 같은 것.
			result = n1 + n2;
			System.out.println(result);
			break;
		case '-':
			result = n1 - n2;
			System.out.println(result);
			break;
		case '*':
			result = n1 * n2;
			System.out.println(result);
			break;
		case '/':
			result = n1 / n2;
			System.out.println(result);
			break;

		}

	}

	public static void main(String[] args) {
		cal(4, 5, '*');
		cal(5, 13, '+');
	}

}
