package task4;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수로 변환할 문자열을 입력하세요 : ");
		String ch = sc.next();

		try {
			if (Integer.parseInt(ch) % 5 == 0 && Integer.parseInt(ch) % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if (Integer.parseInt(ch) % 5 == 0) {
				System.out.println("Buzz");
			} else if (Integer.parseInt(ch) % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println("입력받은 정수 : " + Integer.parseInt(ch));
			}
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다.");
		}
	}

}
