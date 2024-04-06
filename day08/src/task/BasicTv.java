package task;

public class BasicTv {
	// 필드
	String color;
	int inch;
	int price;
	boolean power; // ture : on, false : off
	int channel = 1;

	// 매개변수 3개 받는 생성자(색상, 인치, 가격)
	public BasicTv(String color, int inch, int price) {
		this.color = color;
		this.inch = inch;
		this.price = price;
	}
	
	// 매개변수 4개 받는 생성자(색상, 인치, 가격, 채널)
	public BasicTv(String color, int inch, int price, int channel) {
		super();
		this.color = color;
		this.inch = inch;
		this.price = price;
		this.channel = channel;
	}
	
	
	// 메소드
	// 전원 켜는 메소드 powerOnOff() 매개변수 x, 리턴값 x
	void powerOnOff() {
		if(!this.power) {
			System.out.println("Tv전원이 켜졌습니다");
			power = true;
		}else {
			System.out.println("Tv전원이 꺼졌습니다");
			power = false;
		}
	}

	// 채널올리는 메소드 channelUp() 매개변수 x, 리턴값 o
	void channerUp() {
		if(!this.power) {
			System.out.println("Tv전원을 먼저 켜주세요");
		}else {
			System.out.println("현재 채널 : " + channel);
			System.out.println("채널을 1 올립니다 : " + ++channel);
		}
	}

	// 채널내리는 메소드 channelDown() 매개변수 x, 리턴값 o
	void channerDown() {
		if(!this.power) {
			System.out.println("Tv전원을 먼저 켜주세요");
		}else {
			System.out.println("현재 채널 : " + channel);
			System.out.println("채널을 1 내립니다 : " + --channel);
		}
		
	}

}