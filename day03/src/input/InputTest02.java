package input;

import java.util.Scanner;

public class InputTest02 {
	public static void main(String[] args) {
		
		// inport 자동완성 : ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 입력 : ");
		String str1 = sc.next();
		System.out.println(str1);
		
		System.out.println("두번째 입력 : ");
		String str2 = sc.next();		
		System.out.println(str2);
		
		System.out.println("세번째 입력 : ");
		String str3 = sc.next();
		System.out.println(str3);
	}

}
