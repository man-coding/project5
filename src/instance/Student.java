package instance;

/*
 * 학생 클래스
 * */

public class Student {

	int studentID;   //멤버변수
	String studentName;
	int grade;
	String address;

	public void showStudentInfo() { //학생의 모든 정보를 보여주는 함수 선언

		System.out.println("학번:" + studentID + ", 이름:" + studentName + ", 학년: " + grade + ", 주소:" + address);
	}

}
