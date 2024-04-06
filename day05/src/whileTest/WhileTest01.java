package whileTest;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		// 안녕하세요 000님 환영합니다 10번 출력
		
//		1. while문 안에서 1씩 증가할 정수형 변수 num 선언
//		2. while문을 활용해 10번 출력
//		3. num++
		
//		1. Scanner import
//		2. 이름 변수 선언
//		3. 카운트변수(반복횟수를 조건식)
//		4. while문 {
//		5. 입력받을 메세지
//		6. 이름 입력 메소드
//		7. 출력메세지
//		8. 증감연산자 ++
		
		int num = 0;
		String name = "";
		
		Scanner sc = new Scanner(System.in);
		
		while(num < 10) {
			System.out.println("이름을 입력하세요 : ");
			name = sc.nextLine();
			System.out.println("안녕하세요 " + name + "님 환영합니다");
			num++;
		}
	}

}
