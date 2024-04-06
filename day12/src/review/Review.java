package review;

public class Review {
	public static void main(String[] args) {
		// Review클래스
		// main메소드
		// moveSpeed() : 매개변수2개
		// 모든 메소드 출력하기
		
		moveSpeed(new Car(), 10);
		moveSpeed(new Motorcycle(), 40);
		moveSpeed(new Truck(), 20);
		
	}

	static void moveSpeed(Vehicle vehicle, int speed) {
		vehicle.move();
		vehicle.setSpeed(speed);
		vehicle.getSpeed();
	}

}
