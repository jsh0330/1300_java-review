package exceptionTask;

public class AccountMain {
	public static void main(String[] args) {
	// AccountMain클래스
	//   메인메소드
	//   입금메소드 호출
	//   출금메소드 호출
		
		Account a = new Account();
		
		
		try {
			a.deposit(2000);
			a.withdraw(4000);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
