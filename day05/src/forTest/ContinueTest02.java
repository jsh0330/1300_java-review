package forTest;

public class ContinueTest02 {
	public static void main(String[] args) {
//		1부터 10까지 5를 제외하고 출력하기
//		반복문 for(int i = 0; i < 10; i++)
//		조건문 if(i == 5){
//			continue;
//		출력
		
		for (int i = 0; i < 10; i++) {
			if(i == 4) {
				continue;
			}
			System.out.println(i + 1);
		}
		
	}

}
