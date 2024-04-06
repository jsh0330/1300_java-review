package array;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		// 1. 3명의 학생 java점수를 입력받아 배열에 저장하고
		// 평균점수 출력하기

//		1. 3칸의 배열 ar1 생성
//		2. 세 점수의 합을 구할 sum 생성
//		3. Scanner import
//		4. for (int i = 0; i < ar1.length; i++)
//		5. ar[i]에 입력받은 값 저장
//		6. 평균을 구하고 출력(sum/3)

//		int[] ar1 = new int[3];
//		double sum = 0;
//		
		Scanner sc = new Scanner(System.in);

//		for (int i = 0; i < ar1.length; i++) {
//			System.out.println(i+1 + "번째 학생의 점수를 입력하세요 : ");
//			ar1[i] = sc.nextInt();
//			sum += ar1[i];
//		}
//		
//		System.out.println("평균점수 : " + (double)sum/ar1.length);

		// 2. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 배열에 담고 출력하기
		// 단, 칸수를 이용해서 배열 작성

		// 2. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 배열에 담고 출력하기
		// 단, 칸수를 이용해서 배열 생성

		// 1) 배열3칸 생성
		// 2) 반복문(for {
		// 3) 나머지 연산자를 이용(5개마다 값이 반복됨) }
		// 4) 반복문(출력을 위한 for문)

		int[] ar1 = new int[10];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = i % 5;
		}
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}

		System.out.println();

		// 3. A~F까지 중 c만 제외하고 배열에 담고 출력하기

		int[] ar3 = new int[5];

		for (int i = 0; i < ar3.length; i++) {
			if (i == 2) {
				continue;
			}
			ar3[i] = 65 + i;
			System.out.println((char) (ar3[i]));
		}

		// 4. 5칸의 정수배열을 만들고 입력받아 최대값과 최소값 출력하기
		// 1) 정수형 배열 5칸
		// 2) 입력 클래스 import
		// 3) 변수 String msg; int min, max
		// 4) 반복문(for문) - 입력받기 위한 반복문
		// 5) min = 배열[0], max = 배열[0]
		// 6) 반복문(for문) - 조건문(if문 최소값, if문 최대값)
		// 7) 출력

		int[] ar4 = new int[5];

		for (int i = 0; i < ar4.length; i++) {
			System.out.println(i + 1 + "번째 숫자 입력");
			ar4[i] = sc.nextInt();
		}

		int max = ar4[0], min = ar4[0];

		for (int i = 0; i < ar4.length; i++) {
			if (ar4[i] > max) {
				max = ar4[i];
			}

			if (ar4[i] < min) {
				min = ar4[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
