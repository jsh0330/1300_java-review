package review;

public class Motorcycle extends Vehicle{
    //Motorcycle 클래스 추상클래스 상속받는 클래스
    //속도 필드(private)
    //추상클래스 메소드
	
	private int speed;

	@Override
	void move() {
		System.out.println("오토바이가 움직입니다");
		
	}

	@Override
	void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	void getSpeed() {
		System.out.println("오토바이의 현재 속도 : " + this.speed);
	}
	
	

}
