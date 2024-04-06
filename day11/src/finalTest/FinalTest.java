package finalTest;

public class FinalTest {
	// 클래스 내부에서 상수를 선언하는 방법
	static final double PI = 3.14;
	
	
	public static void main(String[] args) {
		int maxLength = 10;
		System.out.println(maxLength);
		maxLength = 30;
		System.out.println(maxLength);

		// 메소드 내부에서 상수를 선언하는 방법
		final int MAX_LENGTH = 100;
		System.out.println(MAX_LENGTH);
//		MAX_LENGTH = 200;
		System.out.println(PI);

	}

}
