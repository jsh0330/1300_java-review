package final1;

public class Main {
//   Main 클래스
//   - 사용자가 메뉴를 통해 게시물을 작성, 삭제, 조회할 수 있어야 한다

	public static void main(String[] args) {
		Board b1 = new Board();
		b1.addPost("1", "1");
		b1.addPost("2", "2");
		b1.addPost("3", "3");
		b1.addPost("4", "4");
		b1.addPost("5", "5");
		b1.addPost("6", "6");

		b1.getAllPosts();
		try {
			b1.deletePost(100);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("없는번호입니다");
		}
		b1.getAllPosts();
	}

}
