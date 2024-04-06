package task;

import java.util.Scanner;

public class TvTask {
	public static void main(String[] args) {
		String msg = "1. 전원 버튼\n" + "2. 채널 올리기\n" + "3. 채널 내리기\n" + "0. 프로그램 종료\n" + "번호 입력 : ";
		int input = 0;
		// while문을 통해서 프로그램을 무한반복한다
		// 사용자에게 옵션메뉴를 출력하고 번호를 입력받는다
		// 선택한 옵션에 따라 수행한다
		// 1번선택시 : Tv전원을 On, Off한다 => 켜졌을 경우 Tv전원이 켜졌습니다 출력
		// 			꺼져있을 경우 Tv전원이 꺼졌습니다 출력
		// 2번선택시 : Tv전원이 켜져있을 경우 현재 채널을 출력하고 올린 채널 출력
		// 			꺼져있을 경우 Tv전원을 먼저 켜주세요 메시지 출력
		// 3번선택시 : Tv전원이 켜져있을 경우 현재 채널을 출력하고 내린 채널 출력
		// 			꺼져있을 경우 Tv전원을 먼저 켜주세요 메시지 출력
		// 0번선택시 : 프로그램 종료한다
		// 그외 선택시 : 다시 번호를 입력하세요
		
		Scanner sc = new Scanner(System.in);
		
		BasicTv tv = new BasicTv("black", 10, 100, 3);
		
		do {
			System.out.println("Tv의 동작을 골라주세요");
			System.out.println(msg);
			
			input = sc.nextInt();
			
			switch(input) {
			case 1:
				tv.powerOnOff();
				break;
			case 2:
				tv.channerUp();
				break;
			case 3:
				tv.channerDown();
				break;
			case 0:
				break;
			default:
				System.out.println("다시 번호를 입력하세요");
				break;
			}
			
			
		} while (input != 0);
	}
}