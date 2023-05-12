package quiz01;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {

		/*
		 * 1. 정수를 입력받는다. 2. 입력받은 수 까지 약수의 합
		 * 
		 * 예시 입력수 10 약수의 합 18
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력> ");
		int n = scan.nextInt();
		int m = 1;
		int sum = 0;

		while (m <= n) {
			if (n % m == 0) {
				sum += m;
			}

			m++;
		}

		System.out.println(n + "의 약수의 합은: " + sum);

	}
}
