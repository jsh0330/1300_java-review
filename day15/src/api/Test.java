package api;

public class Test {
	public static void main(String[] args) {
		ApiTest2 at = new ApiTest2();
		System.out.println(at);
		
		// alt + shift + z : try ~ catch문 단축키
		try {
			at.div(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		
		System.out.println("출력 끝");
	}

}
