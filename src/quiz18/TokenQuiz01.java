package quiz18;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 nextLine() 문장을 받습니다. 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리 3. 분리한 토큰의
		 * 개수를 출력 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력 1. 안녕 2. 하세요. 3. 오늘은 5. 분리된 문자열을 배열에 저장
		 */
		// keyword - Scanner, nextLine, 공백기준, 개수 출력(형식), 배열저장

		Scanner scan = new Scanner(System.in);
		System.out.print("> ");
		String str = scan.nextLine();
		str = str.trim();

		StringTokenizer st = new StringTokenizer(str);

		int count = st.countTokens();
		System.out.println("분리한 토큰의 개수: " + count);

//		int i = 0;			
//		while(st.hasMoreTokens() != false) {
//			System.out.println(i + ". " + st.nextToken());
//			i++;
//		}

		String[] arr = new String[count];

		for (int a = 1; st.hasMoreTokens(); a++) {

			String word = st.nextToken();

			System.out.println(a + ". " + word);
			arr[a - 1] = word;

		}

		System.out.println(Arrays.toString(arr));

	}
}
