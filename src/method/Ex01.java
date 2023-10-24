package method;

public class Ex01 {

	public static void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다.");
		return;
	}
	
	public static String method2() { //반환값과 선언문의 형식이 일치해야 함
		return "매개변수가 없지만 반환값이 있는 메소드입니다.";
	}
	
	public static void method3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum : " + sum);   //return 생략 가능 -> 중간에 return을 쓰면 함수를 끝낼 수 있음.
	}
	
	public static int method4(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		method1();
		
		String str = method2(); //결과를 저장할 변수 = 함수 호출
		
		method3(1 , 2);
		
		int i = method4(1 , 2); //결과를 저장할 변수 = 함수 호출
		
	}
	
	

}
