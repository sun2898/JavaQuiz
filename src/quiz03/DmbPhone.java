package quiz03;

public class DmbPhone extends Phone {
	// DmbPhone은 Phone클래스를 상속 받습니다.
	// channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	// 메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.

	int channel;

	DmbPhone() {

	}

	DmbPhone(String c, String m, int ch) {
		color = c; // 상속받은 변수
		model = m; // 상속받은 변수
		channel = ch;

	}

	void turnOnDmb() {
		System.out.println("TV를 켭니다");
	}

	void changeChannel(int number) {
		channel = number;

		System.out.println(channel);
	}

	void turnOffDmb() {
		System.out.println("TV를 끕니다");
	}

}
