package thingTask;

public class Main {
	public static void main(String[] args) {

		// Main클래스
		// main 메소드
		// 부모클래스 객체 thing
		// 자식클래스 객체 book
		// 각 객체마다 메소드 호출
		
		Things thing = new Things("물건");
		Book book = new Book("책", "장서혁");
		
		thing.printInfo();
		book.printInfo();
	}

}
