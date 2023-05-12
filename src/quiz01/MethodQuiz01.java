package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {

		method1();

		System.out.println(method2("전달 받은 매개변수 리턴"));

		method3(1, 3, 5);

		System.out.println(method4(6));

		method5("나", 10);

		System.out.println(maxNum(3, 5));

		System.out.println(abs(-6));

		String str = java(5);
		System.out.println(str);

	} // main end

	static void method1() {
		System.out.println("안녕");
	}

	static String method2(String s) {
		return s;
	}

	static void method3(int a, int b, double c) {
		System.out.println("세 변수의 합: " + (a + b + c));
	}

	static String method4(int a) {
		// if(a%2==0) { // 모든 경우의 수에 return 값이 들어갈 수 있도록 해야한다.
		// return "짝수";
		// } else
		// return "홀수";
		// }
		return a % 2 == 0 ? "짝수" : "홀수";
	}

	static void method5(String s, int a) {
		for (int i = 0; i < a; i++) {
			System.out.print(s);
		}
		// String str = "";
		// for(int i = 1; i <= a; i++) {
		// str += i;
		// }
		System.out.println();
	}

	static int maxNum(int a, int b) {
		if (a > b) {
			return a;
		} else
			return b;
	}

	static int abs(int a) {
		// if (a>0) {
		// return a;
		// } else
		// return -a;
		return a > 0 ? a : -a;

	}

	static String java(int a) {
		String str = "";

		for (int i = 1; i <= a; i++) {
			if (i % 2 == 1) {
				str += "자";
			} else
				str += "바";
		}

		return str;
	}
}
