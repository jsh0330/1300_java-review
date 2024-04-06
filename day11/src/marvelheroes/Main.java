package marvelheroes;

public class Main {
	public static void main(String[] args) {
		
		IronMan ironman = new IronMan();
		ironman.setName("토니 스타크");
		superPower(ironman);
		
	}
	
	static void superPower(Hero hero) {
		hero.useSuperpower();
		hero.sayCatchphrase();
	}

}
