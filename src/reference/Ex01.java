package reference;

public class Ex01 {

	public static void main(String[] args) {
		
		Subject math = new Subject("수학", 85);
		Subject korean = new Subject("국어", 100);
		Student student = new Student(1001, "둘리", math, korean);
		
		System.out.println(student.toString());
	}

}

//성적 클래스
class Subject {
	String subjectName;
	int scorePoint;

	public Subject(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", scorePoint=" + scorePoint + "]";
	}

	
	}

//학생 클래스
class Student {
	int studentID;
	String studentName;
	Subject math;
	Subject korean;

	public Student(int studentID, String studentName, Subject math, Subject korean) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", math=" + math + ", korean="
				+ korean + "]";
		//return 값이 문자열이다.
	}
	
	
}
