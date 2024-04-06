package lambdaTest;

public class EsTest {
	public static void main(String[] args) {
		// 식(Expression) 문(Statement)
		// 식은 결과 값
		
		// 문 ; { }
		
		int a = 3; // 문 : 변수 a에 3을 할당, 식의 결과 할당된 값이 3
		System.out.println(a); // 문 : 변수 a값을 출력하는 출력문
		
		int b = a = 5; // 문 : 변수에 값을 할당
		// a = 5 식
		
		add10(10);// 20 : 식, add10(20) : 문
		
	}
	
	static int add10(int num) {
		System.out.println(num + 10); // 문
		return num + 10; // 값을 반환하는 문
		// num + 10 : 식
	}

}
