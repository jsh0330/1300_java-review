package final2;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Board board = new Board();

		while (true) {
			System.out.println("1. 게시물 추가");
			System.out.println("2. 게시물 삭제");
			System.out.println("3. 모든 게시물 보기");
			System.out.println("4. 끝내기");
			System.out.println("원하는 동작을 입력하세요 : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("제목을 입력하세요 : ");
				String title = scanner.next();
				System.out.println("내용을 입력하세요 : ");
				String content = scanner.next();
				board.addPost(title, content);
				System.out.println("게시물추가");
				break;
				
			case 2:
				System.out.print("삭제할 id를 입력하세요 : ");
				int id = scanner.nextInt();
				try {
					board.deletePost(id);
					System.out.println("삭제성공");
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
				board.getAllPosts();
				break;
				
			case 4:
				System.exit(0);

			default:
				System.out.println("올바른 동작을 입력하세요");
			}
		}
	}
}
