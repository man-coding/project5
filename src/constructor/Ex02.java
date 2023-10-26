package constructor;

/*
 * 사용자정의 생성자를 사용하여 인스턴스 생성하기
 * */

public class Ex02 {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "둘리";
		person1.weight = 80;
		person1.height = 180;
		
		Person person2 = new Person("또치");
		person2.weight = 50;
		person2.height = 160;
		
		Person person3 = new Person("도우너", 170, 60);   //사용자정의 생성자는 제일 간편한 코드 인스턴스 값을 한번에 초기화 시킬 때 주로 씀.
	}

}

class Person {
	String name;
	int height;
	int weight;

	public Person() { // 디폴트 생성자는 코드가 없음, 'void' 등 리턴값도 없음. 객체 생성만 하고 있기 때문에.
	} // 사용자정의 생성자를 사용을 할 때는 디폴트 생성자도 직접 만들어줘야 한다.

	public Person(String nm) { // 객체를 생성하고 동시에 멤버 변수의 값을 초기화시키는 역할을 함.
		name = nm;
	}

	public Person(String nm, int he, int we) {
		name = nm;
		height = he;
		weight = we;
	}
}
