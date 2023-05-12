package quiz01;

public class Quiz08 {

	public static void main(String[] args) {

		String[] arr = { "안녕", "hello", "니하오", "오하~", "#$%^" };

		/*
		 * 1. 랜덤수를 생성하고, 이 랜덤수를 이용해서 배열의 랜덤한 값이 출력되게 처리한다. 2. 출력된 문자열이, 어느 나라 언어인지 판별해서
		 * 출력해주면 된다.
		 */

		int a = (int) (Math.random() * arr.length);

		switch (a) {

		case 0:
			System.out.println("선택된단어:" + arr[a] + "\n한국어입니다.");
			break;
		case 1:
			System.out.println("선택된단어:" + arr[a] + "\n영어입니다.");
			break;
		case 2:
			System.out.println("선택된단어:" + arr[a] + "\n중국어입니다.");
			break;
		case 3:
			System.out.println("선택된단어:" + arr[a] + "\n일본어입니다.");
			break;
		case 4:
			System.out.println("선택된단어:" + arr[a] + "\n알 수 없는 언어 입니다.");
			break;
		}

	}
}
