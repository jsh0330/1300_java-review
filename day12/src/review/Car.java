package review;

public class Car extends Vehicle{
    //Car 클래스 추상클래스 상속받는 클래스
    //속도 필드(private)
    //추상클래스 메소드 오버라이딩
	
	private int speed;

	@Override
	void move() {
		System.out.println("자동차가 움직입니다.");
		
	}

	@Override
	void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	void getSpeed() {
		System.out.println("자동차의 현재 속도 : " + this.speed);
	}

	

}
