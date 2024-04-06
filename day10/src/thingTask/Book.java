package thingTask;

public class Book extends Things{

	// Things 클래스를 상속받는 Book클래스
	// 필드 저자(String author)
	String author;

	// 생성자 매개변수2
	public Book(String name, String author) {
		super(name);
		this.author = author;
	}

	// 메소드 오버라이딩
	// 책이름 : 000 출력
	// 저자 : 000 출력
	@Override
	void printInfo() {
		System.out.println("책 이름 : " + this.name);
		System.out.println("저자 : " + this.author);
	}
	

}
