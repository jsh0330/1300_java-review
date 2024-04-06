package musicTask;

public class Rock extends Music {

	// Rock 클래스
	// 락 모드를 출력하는 mode 메소드
	// only 락 실행을 출력하는 onlyRock 메소드

	@Override
	void mode() {
		System.out.println("락 모드");
	}
	
	void onlyRock() {
		System.out.println("only 락");
	}

}
