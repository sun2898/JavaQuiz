package quiz18;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {

		/*
		 * 스캐너를 사용해서 id 입력받음 아이디느 공백을 포함하여 받는다. (nextLine()사용) 단, 공백을 제거한 아이디가 5글자 미만이면
		 * 다시 입력 받는다. 5글자 이상이라면 "id가 등록되었습니다." 출력 후 종료
		 */
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.nextLine();
			str = str.replace(" ", "");
			if (str.length() < 5) {
				System.out.println("다시 입력받습니다.");
			} else {
				System.out.println("id가 등록되었습니다.");
				System.out.println("id : " + str);
				break;
			}
		}

	}
}
