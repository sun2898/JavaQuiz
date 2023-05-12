package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int correct = 0;
		int wrong = 0;

		while (true) {
			int a = (int) (Math.random() * 100) + 1;
			int b = (int) (Math.random() * 100) + 1;
			int c = (int) (Math.random() * 2);

			if (c == 0) {
				System.out.println(a + " + " + b + " = ");
			} else
				System.out.println(a + " - " + b + " = ");

			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");

			int n = scan.nextInt();

			if (n != 0) {
				if (n == a + b || n == a - b) {
					System.out.println("정답입니다.");
					correct += 1;
				} else {
					System.out.println("오답입니다.");
					wrong += 1;
				}
				System.out.println("--------------------------------");
			} else {
				System.out.println("프로그램 정상종료");
				System.out.println("정답: " + correct);
				System.out.println("오답: " + wrong);
				break;
			}
		}
		scan.close();
	}
}
