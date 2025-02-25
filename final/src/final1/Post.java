package final1;

public class Post {
//  Post 클래스
//  - 모든 필드는 private으로 설정한다
//  id: 게시물의 고유 식별자 (정수)
//  title: 게시물의 제목 (문자열)
//  content: 게시물의 내용 (문자열)

	private int id;
	private String title;
	private String content;

	public Post(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id = " + id + ", title = " + title + ", content = " + content;
	}

}
