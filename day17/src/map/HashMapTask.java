package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {
	public static void main(String[] args) {
		// 1. 메뉴 해시맵 만들기
		// 2. put을 이용해 키와 벨류값 넣기
		// 3. 메뉴들 출력해 보여주기
		// 4. 입력받기
		// 5. switch 를 이용해 선택한 번호에 따른 value값 내보내기

		HashMap<String, Integer> menu = new HashMap<>();
		menu.put("아메리카노", 2000);
		menu.put("카페라떼", 2500);
		menu.put("바닐라라떼", 4000);
		menu.put("초코라떼", 4000);

		Scanner scanner = new Scanner(System.in);

		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 바닐라라떼");
		System.out.println("4. 초코라떼");
		System.out.print("번호를 선택하세요: ");

		int pick = scanner.nextInt();

		switch (pick) {
		case 1:
			System.out.println("아메리카노의 가격은 " + menu.get("아메리카노") + "원 입니다.");
			break;
		case 2:
			System.out.println("카페라떼의 가격은 " + menu.get("카페라떼") + "원 입니다.");
			break;
		case 3:
			System.out.println("바닐라라떼의 가격은 " + menu.get("바닐라라떼") + "원 입니다.");
			break;
		case 4:
			System.out.println("초코라떼의 가격은 " + menu.get("초코라떼") + "원 입니다.");
			break;
		default:
			System.out.println("잘못된 선택입니다.");
		}

	}
}