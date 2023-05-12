package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {

		char[] c = { 'a', 'b', 'c', 'd', 'e' };
		String result6 = method6(c);
		System.out.println(result6);

		int[] n = { 1, 2, 3, 4, 5 };
		int result7 = method7(n);
		System.out.println(result7);

		String[] result8 = method8("가", "나");
		System.out.println(Arrays.toString(result8));
	}

	static String method6(char[] c) {
		String str = "";
		for (int i = 0; i < c.length; i++) {
			str += c[i];
		}
		return str;
	}

	static int method7(int[] n) {
		int sum = 0;
		for (int a : n) {
			sum += a;
		}
		return sum;
	}

	static String[] method8(String s1, String s2) {
		String[] s = new String[2];
		s[0] = s1;
		s[1] = s2;
		return s;
	}
}
