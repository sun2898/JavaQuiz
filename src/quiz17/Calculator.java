package quiz17;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {
		/*
		 * 1. 스캐너로 정수 2개를 입력 받아서 두 수의 합을 반환하는 기능 2. 입력된 값이 정수라면 합계를 반환 3. 예외가 발생하면, 직접
		 * 예외를 생성하고(throw) 예외 메세지를 외부로 전달하면 된다. 4. scan.close() 는 finally에서 처리한다.
		 */
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;

		try {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			return num1 + num2;
		} catch (Exception e) {
			throw new Exception("정수만 입력하세요");
		} finally {
			scan.close();
		}

	}

}
