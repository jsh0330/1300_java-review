package animalTest;

public class AnimalMain {
	public static void main(String[] args) {

		// 객체 2개 생성하고 메소드 호출
		Animal animal1 = new Animal("사아자", 10, "사자");
		Animal animal2 = new Animal("호오랑이", 20,  "호랑이");
		
		animal1.printAnimal();
		animal1.eat("사슴");
		animal1.sleep();
		
		animal2.printAnimal();
		animal2.eat("토끼");
		animal2.sleep();

	}
}
