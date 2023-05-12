package quiz02;

public class Tv {

	String company = "LG";
	int channel;
	boolean power;

	/*
	 * 메서드 changeChannel : int - 매개변수 채널번호를 받아서 변경 후 리턴 power : void - 켜져있으면 꺼지고
	 * 꺼져있으면 켜지도록 동작
	 * 
	 */

	int changeChannel(int x) {

		channel = x;
		System.out.println("채널변경: " + channel);
		return channel;
	}

	void power() {

		if (power) {
			power = !power;
			System.out.println("꺼짐");
		} else {
			power = !power;
			System.out.println("켜짐");
		}

	}

	void info() {
		System.out.println("회사명: " + company);
		System.out.println("채널번호: " + channel);
		power();
	}
}
