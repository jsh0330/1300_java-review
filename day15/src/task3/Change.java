package task3;

import java.util.Scanner;

public class Change {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수로 변환할 문자열을 입력하세요 : ");
		String string = sc.nextLine();

		try {
			int number = Integer.parseInt(string);
			System.out.println("입력된 정수: " + number);
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다.");
		}

	}

}
