package anonymousTest;

public class Main {
	public static void main(String[] args) {
		InterA a = new ClassB(); // 업캐스팅
		a.printData();

		InterA ia = new InterA() {

			@Override
			public void printData() {
				System.out.println("익명클래스에서 오버라이딩");
			}
		};
		ia.printData();
		System.out.println(ia);
	}

}
