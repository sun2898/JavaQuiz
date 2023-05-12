package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {

		// 1. 7~100까지 정수 중에 7의 배수만 가로로 출력
		for (int i = 7; i <= 100; i++) {

			if (i % 7 == 0) {
				System.out.print(i + " ");
			}

		}

		System.out.println();

		// 2. 1~200까지의 정수 중에 9의 배수의 개수를 출력.
		int count = 0;
		for (int i = 1; i <= 200; i++) {
			if (i % 9 == 0) {
				count++;
			}
		}
		System.out.println("1에서 200까지의 정수 중 9의 배수의 개수는: " + count);

		// 3. 50~100사이의 두 수 사이의 합
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			sum += i;
		}

		System.out.println("50에서 100까지의 합: " + sum);

		// 4. A-Z까지 가로로 붙여서 출력, A=65, Z=90
//		for(char c = 'A'; c <= 'Z'; c++) {
//			System.out.print(c + " ");
//		}

		String str = "";
		for (char i = 65; i <= 90; i++) {
			str += i;
		}
		System.out.println(str);

		// 5. 입력받은 정수까지 팩토리얼 5! = 5*4*3*2*1
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력> ");
		int n = scan.nextInt();
		int m = 1;
		for (int i = n; i >= 1; i--) {
			m *= i;
		}
		System.out.println(n + "! = " + m);

		scan.close();
	}
}
