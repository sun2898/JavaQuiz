package quiz02;

public class Account {

	/*
	 * 한 사람의 은행 계좌
	 * 
	 * accountNumber - 식별아이디 password - 비밀번호 balance - 잔고
	 * 
	 * 생성자 3가지를 모두 받아서 초기화 하는 생성자
	 * 
	 * 메소드 deposit : void - 잔고에 매개변수를 누적하는 기능 withDraw : void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance : int - 잔고를 리턴하는 기능 메인클래스에서는 각각의 기능을 확인
	 */

	String accountNumber;
	String password;
	int balance;

	Account(String a, String p, int b) {
		accountNumber = a;
		password = p;
		balance = b;
	}

	void info() {
		System.out.println("=====계좌정보=====");
		System.out.println("아이디: " + accountNumber);
		System.out.println("비밀번호: " + password);
		System.out.println("현재잔고: " + balance);
	}

	void deposit(int money) {
		if (money > 0) {
			balance += money;
		} else
			System.out.println("입금이 불가능합니다.");

	}

	void withDraw(int money) {
		if (money <= balance) {
			balance -= money;
		} else
			System.out.println("출금이 불가능합니다.");
	}

	int getBalance() {

		return balance;
	}

}
