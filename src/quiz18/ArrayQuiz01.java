package quiz18;

import java.util.Arrays;

public class ArrayQuiz01 {

	public static void main(String[] args) {

		// arr과 arr2는 길이가 1차이가 난다.
		// arr은 마라톤 참가자, arr2는 마라톤 완주자
		// 완주하지 못한 사람을 리턴하는 메서드를 만드세요.

		String[] arr = { "홍길동", "홍길자", "이순신", "신사임당", "김유신", "이황", "황희" };
		String[] arr2 = { "홍길동", "이순신", "신사임당", "홍길자", "김유신", "이황" };

		System.out.println(test(arr, arr2));

	}

	public static String test(String[] arr, String[] arr2) {
		Arrays.sort(arr);
		Arrays.sort(arr2);

		String person = "";
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr2[i]) {
				person = arr[i];
				break;
			}
			person = arr[arr.length - 1];
		}

		return person;
	}

}
