package lambda;

public class Main {
	public static void main(String[] args) {
		FunctionalInter1 fi1 = new FunctionalInter1() {

			@Override
			public int add10(int number) {
				return 0;
			}
		};

		FunctionalInter1 fii = number -> number + 10;
		System.out.println(fii.add10(10));
		System.out.println(fii);

	}

}
