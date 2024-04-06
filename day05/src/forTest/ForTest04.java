package forTest;

import java.util.Scanner;

public class ForTest04 {
	public static void main(String[] args) {
//		3단 구구단 3 x 1 = 3
//		...
//		3 x 9 = 27
		for (int i = 1; i < 10; i++) {
			System.out.println("3 * " + i + " = " + 3*i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요");
		int dan = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}

}
