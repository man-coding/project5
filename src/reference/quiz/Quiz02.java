package reference.quiz;

//부서 객체를 생성하고, 부서원을 추가하세요.
public class Quiz02 {

	public static void main(String[] args) {
		
		//직원 3명 생성. 먼저 해줘야 함.
		Employee employee1 = new Employee("제시", 27, 5000000, 5); // 직원 정보가 있어야 되므로 위에 적는다.
		Employee employee2 = new Employee("스칼렛", 32, 4000000, 4);
		Employee employee3 = new Employee("베인", 22, 3000000, 2);
		
		//부서를 생성하고 부서원 추가
		Department department = new Department(employee1, employee2, employee3);

	}

}

class Department {
	Employee head;
	Employee senior;
	Employee junior;

	public Department(Employee head, Employee senior, Employee junior) {
		super();
		this.head = head;
		this.senior = senior;
		this.junior = junior;
	}

}

class Employee { // 중복되는 Employee 를 타입으로 사용한다.
	String name;
	int age;
	int pay;
	int career;

	public Employee(String name, int age, int pay, int career) {
		super();
		this.name = name;
		this.age = age;
		this.pay = pay;
		this.career = career;
	}

}