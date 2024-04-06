package task01;

public class Burger extends Food {

	@Override
	void calculatePrice() {
		System.out.println(name + "의 가격 : " + price);
	}

	@Override
	void getFoodName() {
		System.out.println("음식이름 : " + name);
	}

}
