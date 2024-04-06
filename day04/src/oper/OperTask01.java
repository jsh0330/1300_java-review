package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		// 정수 2개를 받아서 큰 수 출력하기
		
		//1. 정수1 입력 : 10
		//2. 정수2 입력 : 20
		//정수1 보다 정수2가 더 큽니다
		
//		1. 정수형태로 입력받을 변수 num1, num2 변수 선언
//		2. String 변수 선언
//		3. Scanner import
//		4. 입력받기
//		5. 큰 수 출력(삼항연산자 이용)
		
		int num1 = 0, num2 = 0;
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력 : ");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		num2 = sc.nextInt();
		
//		result = num1 > num2 ? "큰 수 : " + num1  :"큰 수 : " + num2;
		result = num1 > num2 ? "큰 수 : " + num1  : num1 == num2 ? "같습니다" :"큰 수 : " + num2;
		System.out.println(result);
		
	}

}
