package tvTest;

public class TvMain {
	public static void main(String[] args) {
		// Tv 객체
		Tv samsungTv = new Tv();
		System.out.println(samsungTv);
		
		System.out.println(samsungTv.ch);
		System.out.println(samsungTv.power);
		samsungTv.powerOnOff();
		samsungTv.chUp();
		
	}

}
