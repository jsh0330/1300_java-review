package accessTask;

public class MainTask {
	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.name = "동물";
		animal.eat();
		
		Cat cat = new Cat();
		cat.name = "고양이";
		cat.setColor("검정");
		cat.play();
		cat.scratch();

	}
}
