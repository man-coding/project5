package constructor.quiz;

public class Quiz02 {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.company = "현대";
		car1.model = "쏘나다";
		car1.color = "흰색";
		car1.maxspeed = 200;

		Car car2 = new Car("기아", "레이", "검정색", 150);

		System.out.println(car1.model);
		System.out.println(car2.color);

	}

}

class Car {
	String company;
	String model;
	String color;
	int maxspeed;

	public Car() {

	}

	public Car(String company, String model, String color, int maxspeed) {
		super();
		// company = company; // -> 구분이 안됨. 소용없는 코드임
		this.company = company; // this가 붙어있는 model은 멤버변수(전역변수)를 가리킴. (이름이 다르면 this 안 붙여도 구분 가능)
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}

}