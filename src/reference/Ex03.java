package reference;

//기본형 매개 변수와 참조형 매개변수의 메모리 구조 비교

public class Ex03 {

	public static void main(String[] args) {
		int num = 10;    //기본자료형은 함수에서 값을 변경해도 영향이 없다. (밸류 자체를 복사하기 때문)
		method1(num);
		System.out.println(num);
		
		Subject math = new Subject("수학", 100);  // 값이 변경됨. ( 주소를 복사하기 때문)
		method2(math);
		System.out.println(math.toString());
	}

	public static void method1(int n) {
		n = 5; //값 변경
	}

	public static void method2(Subject sub) {
		sub.scorePoint = 50; //점수 변경
	}
}
