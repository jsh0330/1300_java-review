package fanTest;

public class BasicFan extends FanAdapter {
	// 1. BasicFan 클래스
	// 버튼으로 전원켜기, 버튼으로 전원끄기, turbo는 비워둔다

	@Override
	public void on() {
		System.out.println("버튼으로 전원을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("버튼으로 전원을 끕니다");
	}

}
