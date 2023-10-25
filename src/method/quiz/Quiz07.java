package method.quiz;

public class Quiz07 {
	
	public static void method(int num) { // 코테에 많이 나옴.
		
		int sum = 0;
		
	
		sum = sum + (num%10); //1의자리   93*10 + 2
		
		
		num = num/10;
		sum = sum + (num%10); //10의자리  9*10 + 3
		
		
		num = num/10;    // 9
		sum = sum + num; //100의자리
		
		System.out.println(sum);
		
		
		
		
		
		
		//int a = num / 100;
		//int b = num / 10 - (num / 100 * 10);     //93-90= 3
		//int c = num % 10;
		//int result = a + b + c;
		
		//System.out.println(result);
		
	}

	public static void main(String[] args) {
		method(932);
	}

}
