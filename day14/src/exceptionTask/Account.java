package exceptionTask;

public class Account {
//은행계좌 클래스

//필드 : 잔고 balance private
//생성자 : 기본생서자 추가
//출금메소드 : withdraw 매개변수 1개
//   잔액보다 출금금액이 크다면 출금불가 예외처리/현재 잔고는 _원입니다. 출금금액의 _원이 부족하여 출금이 불가능합니다 출력

//입금메소드 : deposit 매개변수 1개
//   잔액에 입금된 금액 추가후 입금된 금액은 _원입니다. 현재 잔고는 _원입니다. 출력

//   모든 예외처리는 메소드를 사용하는 쪽으로 던지기

	private int balande;

	public Account() {
		super();
	}

	public int getBalande() {
		return balande;
	}

	public void setBalande(int balande) {
		this.balande = balande;
	}

	void withdraw(int num) throws MyException {
		if (balande < num) {
			throw new MyException("현재 잔고는 " + this.balande + "원입니다. 출금금액의 " + (num - this.balande) + "원이 부족하여 출금이 불가능합니다");
		} else {
			balande -= num;
			System.out.println("출금된 금액은 " + num + "원입니다. 현재 잔고는 " + balande + "원 입니다.");
		}
	}

	void deposit(int num) {
		balande += num;
		System.out.println("입금된 금액은 " + num + "원입니다. 현재 잔고는 " + balande + "원 입니다.");
	}

}
