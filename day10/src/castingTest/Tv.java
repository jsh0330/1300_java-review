package castingTest;

public class Tv {
	// 필드
	int vol;
	int ch;
	boolean power;
	
	// 메소드
	void chUp() {
		System.out.println("현재 채널 : " + this.ch);
	}
	
	void chDown() {
		System.out.println("현재 채널 : " + this.ch);
	}

	void powerOnOff() {
		System.out.println("tv 전원을 켜고 끕니다");
	}

}
