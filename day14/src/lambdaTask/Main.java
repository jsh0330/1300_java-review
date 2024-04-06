package lambdaTask;

public class Main {
	public static void main(String[] args) {

		// 2. Main.java(클래스)에 static 메소드를 선언한다
		// -MultipleInter 타입을 반환한다
		// -이름은 calculater
		// -매개변수는 boolean 타입
		// 매개변수로 true가 들어오면 두 수의 곱을 반환하는 람다식을 만들고
		// false가 들어오면 0을 반환하는 람다식을 만든다
		// 작성된 람다식을 MultipleInter 타입의 변수에 저장하여 반환하는
		// 메소드를 만든다

		int result = calculater(true).calc(1, 2);
		System.out.println(result);
		
	}

	static MultipleInter calculater(boolean isTrue) {
		if (isTrue) {
			return (num1, num2) -> num1 * num2;
		} else {
			return (num1, num2) -> 0;
		}

	}
}
