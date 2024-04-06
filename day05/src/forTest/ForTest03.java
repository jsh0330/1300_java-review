package forTest;

import java.util.Iterator;

public class ForTest03 {
	public static void main(String[] args) {
//		초기식 int i = 0;
//		1~100까지 짝수만 출력 tab키 적용
//		A~F 출력
//		aBcDeF... 출력
		
//		1. for(int i = 1; i <= 100; i++)
//		2. if(i % 2 == 0)
//		3. 출력(tab키)
		
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.print(i + "\t");
			}
		}
		
		System.out.println("");
		
//		1. 대문자 A 유니코드 65  F 유니코드 70
//		2. for (int i = 0; i < 6; i++)
//		3. (char)(65 + i)
		
		for (int i = 0; i < 6; i++) {
			System.out.println((char)(65 + i));
		}
		
//		1. 97 66 99 68
		for (int i = 0; i < 26; i++) {
//			if(i % 2 == 0) {
//				System.out.println((char)(i + 97));
//			}else {
//				System.out.println((char)(i + 65));
			System.out.print((char)(i % 2 == 0 ? (i + 97) : (i + 65)));
//			}
			
		}
	}
	
	

}
