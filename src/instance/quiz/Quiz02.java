package instance.quiz;

import java.util.Date;

public class Quiz02 {

	public static void main(String[] args) {

		Order order = new Order();  // new Order 꼭 써줘야 함
		order.no = 1111;
		order.date = "2018년 3월 12일";
		order.name = "둘리";
		order.address = "서울시 영등포구 여의도동 20번지";
		order.showOrderInfo();
		
		Date date = new Date();
		System.out.println(date);
		date.setMonth(12);
		System.out.println(date);

		

	}
}

class Order {

	int no; // 변수 메소드 내부에서 어디서나 그냥 사용할 수 있음
	String date;
	String name;
	String address;

	public void showOrderInfo() { // 입력값 필요없음. 값만 출력하고 그냥 끝남 (돌려줄 값이 없을 때는 void 사용)

		System.out.println("주문번호: " + no + " 주문날짜: " + date + " 주문자이름: " + name + " 배송지: " + address);
	}

}
