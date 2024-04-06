package review;

public class Main {
	public static void main(String[] args) {
		// 익명클래스로 계산기 작성
		Cal cal = new Cal() {

			@Override
			public int sub(int num1, int num2) {
				int result = 0;
				result = num1 - num2;
				return result;
			}

			@Override
			public int add(int num1, int num2) {
				int result = 0;
				result = num1 + num2;
				return result;
			}
		};

		// 계산기 메소드 2개 출력
		
		System.out.println(cal.sub(3, 2));
		System.out.println(cal.add(3, 2));
	}

}
