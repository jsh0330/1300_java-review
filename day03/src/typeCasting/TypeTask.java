package typeCasting;

public class TypeTask {
	public static void main(String[] args) {
		// 년도 월 일 정수형태 변수로 만들기
		int year = 2024;
		int month = 3;
		int day = 12;
		
		//출력하기
		System.out.println("올해는 " + year + "년, " + month + "월, " + day + "일 입니다");
		
		// 년도 변수를 문자열로 바꿔서 year2에 저장하기
		String year2 = year + "";
		// 2와 4를 char 자료형으로 바꾸기
//		char ch1 = year2.charAt(2);
//		char ch2 = year2.charAt(3);
		//24만 출력
//		System.out.print(ch1);
//		System.out.println(ch2);
		System.out.printf("%c%c\n", year2.charAt(2), year2.charAt(3));
		
		//월, 일 문자열로 바꿔서 result에 대입
		String result = month + "." + day;
		//실수로 바꾸기
		double result2 = Double.parseDouble(result);
		//출력
		System.out.println(result2);
		
	}

}
