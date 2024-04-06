package input;

import java.util.Scanner;

public class InputTesk01 {
	public static void main(String[] args) {
		// Scanner 클래스 임포트
		Scanner sc = new Scanner(System.in);
		//이름을 입력하세요 출력
		System.out.print("이름을 입력하세요 : ");
		// 문자열 자료형 name에 입력받은 값 저장
		String name = sc.next();
		// 출력
//		System.out.println(name + "님 안녕하세요");
		System.out.println(name);

	}

}
