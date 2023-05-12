package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {

		/*
		 * updown게임 1~100까지 랜덤한 수를 1번 생성한다. (반복문 밖에서) 스캐너를 통해서 값을 입력받는다. 랜덤 수가 입력받은 값보다
		 * 작으면 "더 작은수를 입력하세요" 랜덤 수가 입력받은 값보다 크면 "더 큰 수를 입력하세요" 정답을 맞추면 시도횟수: x회 를 출력하고
		 * 종료
		 */
		int a = (int) (Math.random() * 100) + 1;
		int count = 1;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("입력: ");
			int i = scan.nextInt();
			if (i == a) {
				System.out.println(count + "회에 성공!");
				break;
			} else if (i < a) {
				System.out.println("더 큰수를 입력하세요");
			} else {
				System.out.println("더 작은수를 입력하세요");
			}
			count++;
		}

		scan.close();
	}
}
