package methodOverloading;

public class OverloadingTest01 {
	// 메소드 오버로딩 : 매개변수의 타입, 개수, 순서가 다르면 같은 이름의 메소드로 선언할 수 있다
	
	// 두 개를 더해서 출력하는 메소드
	void printNum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	void printNum(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	public static void main(String[] args) {
		OverloadingTest01 ot = new OverloadingTest01();
		ot.printNum(10, 20.5);
		ot.printNum(10, 20);
		
	}

}
