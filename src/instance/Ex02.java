package instance;

/*
 * 학생클래스의 인스턴스(객체) 여러 개 생성하기
 * */
public class Ex02 {

	public static void main(String[] args) {

		Student student1 = new Student(); // 첫번째 학생 생성
		student1.studentID = 1001;
		student1.studentName = "둘리";
		student1.grade = 2;
		student1.address = "인천";
		student1.showStudentInfo();

		System.out.println("객체의 주소는 " + student1 + " 입니다.");
		System.out.println();

		Student student2 = new Student();  // 두번째 학생 생성
		student2.studentID = 1002;
		student2.studentName = "또치";
		student2.grade = 3;
		student2.address = "서울";
		student2.showStudentInfo();

		System.out.println("객체의 주소는 " + student2 + " 입니다.");
	}

}
