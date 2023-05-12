package quiz01;

import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {

		/*
		 * 1. 1~9까지 숫자 중 절대 중복되지 않는 숫자 3개 추출 arr를 랜덤하게 10번 섞어준다. 0~2번째 값을 새로운 배열로 옮겨
		 * 담는다.
		 */

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int temp = 0;

		for (int i = 1; i <= 10; i++) {
			int n = (int) (Math.random() * 9);
			int m = (int) (Math.random() * 9);
			temp = arr[n];
			arr[n] = arr[m];
			arr[m] = temp;
		}
		int[] arr2 = new int[3];
		arr2[0] = arr[0];
		arr2[1] = arr[1];
		arr2[2] = arr[2];
		System.out.println(Arrays.toString(arr2));
	}
}
