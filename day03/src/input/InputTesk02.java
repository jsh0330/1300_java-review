package input;

import java.util.Scanner;

public class InputTesk02 {
	public static void main(String[] args) {
		
		// 두 정수를 입력받고 합을 출력하기
		// next() 메소드만 사용
		
		// 변수 선언
		String num1 = "", num2 = "";
		int result = 0;
		
		// Scanner 클래스 임포트
		Scanner sc = new Scanner(System.in);
		
		// 입력받기
		System.out.println("정수1 출력 : ");
		num1 = sc.next();
		System.out.println("정수2 출력 : ");		
		num2 = sc.next();
		
		// num1과 num2를 정수형으로 바꾼다
		result = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		// 출력
		System.out.println("정답은?");
		System.out.println(result);
		
		
	}

}
