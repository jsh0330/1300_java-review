package forTest;

public class TwoForTest03 {
	public static void main(String[] args) {
//		2단 ~ 9단까지 구구단 출력하기
//		1. 구구단 출력 Two
//		2. 바깥for => 1 ~ 9
//		3. 안쪽for => 2 ~ 9
		
		for (int num = 1; num < 10; num++) {

			for (int dan = 2; dan < 10; dan++) {
				System.out.print(dan + " * " + num + " = " + dan*num + "\t");
				
			}
			System.out.println("");
		}
	}

}
