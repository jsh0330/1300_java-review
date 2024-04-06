package fanTest;

public class BasicFan2 implements Fan{
	// 2. BasicFan2 클래스
	// 리모컨으로 전원켜기, 리모컨으로 전원끄기, turbo는 터보 출력

	@Override
	public void on() {
		System.out.println("리모컨으로 전원을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("리모컨으로 전원을 끕니다");
	}

	@Override
	public void turbo() {
		System.out.println("터보");
	}

}
