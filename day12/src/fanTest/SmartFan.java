package fanTest;

public class SmartFan implements Fan{
	   //3. SmartFan 클래스
	   //음성인식으로 전원켜기, 음성인식으로 전원끄기, turbo는 터보 출력
	
	@Override
	public void on() {
		System.out.println("음성인식으로 전원을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("음성인식으로 전원을 끕니다");
	}

	@Override
	public void turbo() {
		System.out.println("터보");
	}

}
