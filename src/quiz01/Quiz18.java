package quiz01;

public class Quiz18 {

	public static void main(String[] args) {

		// 배열 요소들 중 짝수인 값들의 합
		int[] arr = { 54, 32, 3, 5, 7, 14, 20 };
		int sum = 0;

		int[] arr2 = { 1, 2, 3 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("짝수 값들의 합: " + sum);

	}
}