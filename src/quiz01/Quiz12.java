package quiz01;

public class Quiz12 {

	public static void main(String[] args) {

		// 1000 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count(개수)

		int a = 1;
		int count = 0;

		while (a <= 1000) {
			if (a % 4 == 0 && a % 8 != 0) {
				count++; // 1 증가
			}
			a++;
		}
		System.out.println("count의 개수는?! : " + count);

		int b = 50;
		int sum = 0;

		while (b <= 100) {
			sum += b;
			b++;
		}
		System.out.println("50부터 100까지의 합: " + sum);

	}
}
