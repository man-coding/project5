package method;

/*
 * 입력한 숫자만큼 "안녕하세요"를 출력하는 함수를 만들고 호출하기.
 * */

public class Ex04 {

	public static void printHello(int cnt) {
		for (int i = 1; i <= cnt; i++) {
			System.out.println("안녕하세요"); //출력하고 끝인지, 리턴값이 필요한지 확인할 것. 여기에서 리턴값은 없음.
		}
	}

	public static void main(String[] args) {
		printHello(3); // 함수 호출 , 매개변수의 갯수 확인하여 입력(cnt)
		
		
		}

}
