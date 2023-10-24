package object;

/*
 * 학생 '클래스' 만들기
 * */

public class Student {  //클래스를 만드는 연습만 하는 것, 실행 안됨.
	
	//학생의 '속성'을 멤버 변수로 선언
	int studentID; //학번 (1001) (설계도일 뿐이므로 값을 대입하진 않는다.
	String studentName; //이름 (둘리)
	int grade; //학년 (3)
	String address; //주소 (인천 남동구 ~)
	
	//학생의 '기능'을 메소드로 선언
	public void goSchool() {
		System.out.println("학교에 간다");

	}
	
	public void study() {
		System.out.println("공부를 한다");

}
}
