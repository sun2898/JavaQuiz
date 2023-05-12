package quiz01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 나이는 정수형, 키는 실수형
		// 키는 140이상, 나이는 8세 이상인 경우만 놀이기구 탑승 가능

		Scanner scan = new Scanner(System.in);
		System.out.println("키와 나이를 입력하세요");

		System.out.print("키>");
		double cm = scan.nextDouble();
		System.out.print("나이>");
		int age = scan.nextInt();

		if (cm >= 140 && age >= 8) {
			System.out.println("놀이기구 탑승 가능!");
		} else {
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}

		scan.close();

	}
}
