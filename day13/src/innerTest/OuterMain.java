package innerTest;

public class OuterMain {
	public static void main(String[] args) {
		// Outer 외부클래스의 인스턴스 생성
		Outer o = new Outer();
		System.out.println(o); // innerTest.Outer@6f2b958e

		// Inner 내부클래스의 인스턴스 생성
		Outer.Inner i = new Outer().new Inner();
		System.out.println(i);

		// Outer 외부클래스의 참조변수 o를 이용해서
		// Inner 내부클래스의 인스턴스를 생성
		Outer.Inner i1 = o.new Inner();
		System.out.println(i1);

	}

}
