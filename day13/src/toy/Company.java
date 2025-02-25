package toy;

import java.util.Random;

public class Company {
	// 필드
	String branch;

	// 생성자
	public Company(String branch) {
		super();
		this.branch = branch;
	}

	// 메소드
	// Toy를 구현하여 만든 장난감을 회사에서 등록하기 위해 사용하는 메소드
	public void register(Toy toy) {
		String[] list = toy.speackList();
		System.out.println(this.branch + " 지점");
		Random r = new Random();
		int index = r.nextInt(list.length);
//      System.out.println(index);
		for (int i = 0; i < list.length; i++) {
			System.out.println(i + 1 + ". " + list[i]);
		}

		System.out.println("=====================");

		if (toy instanceof ToyAdapter) {
			System.out.println("버튼이 존재하지 않는다");
			return;
		}
		toy.pushBtn(list[index]);
	}
}
