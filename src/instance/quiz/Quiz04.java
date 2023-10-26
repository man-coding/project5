package instance.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setStatus(true);
		car.showStatus(); // 현재상태 출력
		
	}

}

class Car{
	
	boolean status; //현재상태
	
	
	public void setStatus(boolean stt) { //현재상태를 변경하는 메소드 선언 
		status = stt; // status 값이 stt 값으로 교체가 되는 것.
		
	}
	public void showStatus() { // 현재상태를 출력하는 메소듣 선언
		
		System.out.println(status);
	}
}