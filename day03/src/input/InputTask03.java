package input;

import java.util.Scanner;

public class InputTask03 {
	public static void main(String[] args) {
		// 이름과 나이를 입력받아서 000님의 나이는 0살입니다 출력하기

//		1. 변수 선언하기
//		2. Scanner 임포트
//		3. 입력받기
//		4. 출력하기
		
		String name = "", age = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		System.out.println("나이를 입력하세요 : ");
		age = sc.next();
		
		System.out.println(name + "님의 나이는 " + age + "살 입니다");
		System.out.println(name + "님의 나이는 " + (Integer.parseInt(age) + 1) + "살 입니다");
	}

}
