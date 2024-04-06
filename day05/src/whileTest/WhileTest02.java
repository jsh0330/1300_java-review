package whileTest;

public class WhileTest02 {
	public static void main(String[] args) {
//		1부터 100까지의 짝수의 합 출력(while문)
		
//		1. while문 안에서 1씩 증가할 변수 num 선언
//		2. num의 값을 차레대로 더해줄 변수 sum 선언
//		3. while(num<=100) {
//		4. if(num % 2 == 0){
//		4. sum += num
//		5. num++
//		6. 출력
		
		int num = 1, sum = 0;
		
		while (num <= 100) {
			if (num % 2 == 0) {
				sum += num;
			}
			num++;
		}
		
		System.out.println(sum);
	}

}
