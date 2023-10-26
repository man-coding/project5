package instance;

/*
 * 학생클래스 정의하고, 인스턴스 생성하기
 * */

public class Ex01 {

	public static void main(String[] args) {
	
		Student student = new Student();
		
		student.studentID = 1001;     //값을 변경할 때
		student.studentName = "둘리";
		student.grade = 2;
		student.address = "인천 연수구";
		
		
		System.out.println("학생의 모든 정보를 출력합니다.");     
		System.out.println("studentID = " + student.studentID);    //값을 불러올 때
		System.out.println("studentName = " + student.studentName);
		System.out.println("grade = " + student.grade);
		System.out.println("address = "	+ student.address);
		System.out.println("=========================================");
		student.showStudentInfo();
		System.out.println("=========================================");
		System.out.println("객체의 주소는 " + student + " 입니다.");
		
		
	}

}
