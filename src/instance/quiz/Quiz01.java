package instance.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Person person = new Person();

		person.personName = "James";
		person.personAge = 40;
		person.personIsMarried = true;
		person.personChild = 3;
		person.showPersonInfo();

		System.out.println("이름: " + person.personName);

	}

}

class Person {

	String personName;
	int personAge;
	boolean personIsMarried;
	int personChild;

	public void showPersonInfo() {

		System.out.println(
				"이름:" + personName + ", 나이:" + personAge + ", 결혼여부: " + personIsMarried + ", 자식:" + personChild);
	}
}
