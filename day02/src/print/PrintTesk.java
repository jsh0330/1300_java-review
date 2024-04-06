package print;

public class PrintTesk {	//PrintTesk 클래스의 시작영역
	public static void main(String[] args) {	//메인메소드의 시작영역
//      실습1 문자열을 수정하여 실행결과처럼 출력하세요
      System.out.print("봄\n\t여름\n가을\n\t겨울\n");	//봄 출력 후 줄바꿈 후 들여쓰기 후 여름 출력 후 줄바꿈 후 가을출력 후 줄바꿈 후 들여쓰기 후 겨울출력 후 줄바꿈
      // 실행결과:
      // 봄
      //       여름
      // 가을
      //       겨울
      
//      실습2
//      문자열타입 weather, 값은 맑음
//      정수형타입 month, 월
//      정수형타입 date, 일
//      실수형타입 max => 10.5253
//      실수형타입 min => 5.2535
      
//      변수를 이용해서 printf 값을 출력
//      월 일의 최고 기온은 00.00입니다
//      월 일의 최저 기온은 00.000입니다
//      오늘의 날씨는 "맑음"입니다
      String weather = "맑음";	//문자열 자료형 변수 weather에 맑음이란 값 대입
      int month = 3;	//정수 자료형 변수 month에 3 대입
      int date = 11;	//정수 자료형 변수 date에 11 대입
      double max = 10.5253;	//
      double min = 5.2535;
      char yoil = '월';
      
      System.out.printf("%d월 %d일의 최고 기온은 %.2f입니다\n", month, date, max);
      System.out.printf("%d월 %d일의 최저 기온은 %.3f입니다\n", month, date, min);
      System.out.printf("오늘의 날씨는 \"%s\"입니다\n", weather);
      System.out.printf("%d월 %d일 %c요일의 날씨는 \"%s\"입니다",month, date, yoil, weather);

		
	}

}
