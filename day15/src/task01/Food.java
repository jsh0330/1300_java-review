package task01;

public abstract class Food {
	
	int price;
	String name;
	
	abstract void calculatePrice();
	abstract void  getFoodName();
	
	void display() {
		System.out.println("주문한 음식: " + this.name + ", 가격: " + this.price);
	}

}
