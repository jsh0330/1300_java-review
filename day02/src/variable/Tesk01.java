package variable;

public class Tesk01 {
	public static void main(String[] args) {
		//이름과 나이 취미를 변수에 저장하고 아래 형식대로 출력하기
		//1) 제 이름은 000이고, 나이는 0살 입니다
		//2) 제 이름은 000이고,
//			 취미는 000입니다.
		//3) 제 이름은 000이고, 나이는 '0'살입니다.
//				취미는 "000"입니다.
		
		String name = "장서혁";
		int age = 20;
		String hobby = "게임하기";
		
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
		System.out.println("제 이름은 " + name + "이고,\n취미는 " + hobby + "입니다.");
		System.out.println("제 이름은 " + name + "이고, 나이는 \'" + age + "\'입니다. \n\t취미는 \"" + hobby + "\"입니다.");
	}

}
