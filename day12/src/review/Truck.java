package review;

public class Truck extends Vehicle{
    //Truck 클래스 추상클래스 상속받는 클래스
    //속도 필드(private)
    //추상클래스 메소드
	
	private int speed;

	@Override
	void move() {
		System.out.println("트럭이 움직입니다");
		
	}

	@Override
	void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	void getSpeed() {
		System.out.println("트럭의 현재 속도 : " + this.speed);
	}
	
	

}
