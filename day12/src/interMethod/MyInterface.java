package interMethod;

public interface MyInterface {
	// 상수, 추상메소드
	void abstactMethod();
	
	// default 메소드
	default void defaultMethod() {
		System.out.println("디폴트 메소드 호출");
	}
	
	// static 메소드 호출
	static void staticMethod() {
		System.out.println("스태틱 메소드 호출");
	}

}
