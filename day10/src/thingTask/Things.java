package thingTask;

public class Things {
	// 필드 이름
	String name;

	// 생성자 매개변수1
	public Things(String name) {
		this.name = name;
	}

	// 메소드 printInfo : 이름을 출력
	void printInfo() {
		System.out.println(this.name);
	}

}
