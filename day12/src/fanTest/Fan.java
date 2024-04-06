package fanTest;

public interface Fan {
	// 상수
	int MAX_STRANGTH = 3;
	int MIN_STRANGTH = 0;

	// 추상메소드
	void on();

	void off();

	void turbo();

}
