package quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		/*
		 * 1. 하나의 정수를 입력받습니다. 2. 이 정수가 짝수인지, 홀수인지, 음수인지, 0인지 판별하는 코드 작성
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("> ");
		int a = scan.nextInt();

		if (a > 0) {
			if (a % 2 == 1) {
				System.out.println("a는 홀수 입니다.");
			} else
				System.out.println("a는 짝수 입니다.");
		} else if (a == 0) {
			System.out.println("a는 0 입니다.");
		} else
			System.out.println("a는 음수 입니다.");

		scan.close();

	}

}
