package quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {

		/*
		 * 어떤 정수를 입력을 받는다. 입력받은 정수에 해당하는 구구단을 세로로 출력한다.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요> ");
		int i = scan.nextInt();
		int j = 1;

		System.out.println("구구단: " + i + "단");

		while (j < 10) {

			System.out.println(i + " x " + j + " = " + (i * j));

			j++;

		}

	}
}
