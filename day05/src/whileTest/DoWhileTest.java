package whileTest;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
//		boolean isTrue = false;
//		
//		while(isTrue) {
//			System.out.println("출력");
//		}
//		
//		do {
//			System.out.println("장서혁");
//		}while(isTrue);

//		사용자로부터 숫자를 입력받아서 해당 숫자가 양수인지 검사
//		입력된 숫자가 양수가 아니면 사용자에게 다시 입력하라는 메세지를 출력하고 다시 받기
//		입력된 숫자가 양수을 경우만 양수입니다 출력

//		1. 입력받을 변수 num 선언
//		2. do{
//		3. 입력받기
//		4. if(num<=0){
//		5. 양수가 아닙니다 출력
//		4. while(num<0){
//		5. 양수입니다 출력

		int num = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("숫자를입력하세요 : ");
			num = sc.nextInt();
			if (num <= 0) {
				System.out.println("양수가 아닙니다");
			}
		} while (num < 0);
		System.out.println("양수입니다");

//		while문으로 바꾸기
//		1. 입력클래스 import
//		2. 카운트변수
//		3. while(<=0){
//		4. 입력받기
//		5. if(num<=0){
//		6. 양수가아닙니다 출력
//		7. 출력

		int number = 0;
		while (number <= 0) {
			System.out.println("숫자 입력 : ");
			number = sc.nextInt();
			if (number <= 0) {
				System.out.println("양수가 아닙니다");
			}
		}
		System.out.println(number + "양수입니다");
	}

}
