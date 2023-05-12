package quiz18;

public class StringQuiz03 {

	public static void main(String[] args) {
		// 회문비교 -> "다시 합창 합시다"
		/*
		 * 1. String palindrome(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static
		 * 메서드입니다. 2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장. 3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다
		 * 좋아 등 4. 문장은 공백을 포함하여 받을 수 있습니다. 5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다. 조건
		 * 빌더의 reverse() 는 금지 입니다.
		 * 
		 * 6. 힌트) 공백은 없어져야 비교가 됩니다. 회문은 첫글자와, 마지막글자 가 똑같습니다.
		 * 
		 */
		System.out.println(palindrome("아이오아이"));
		System.out.println(palindrome("다시 합창 합시다"));
		System.out.println(palindrome("다jslei"));
		System.out.println(palindrome("anewna"));
		System.out.println(palindrome("aiiiia"));
		System.out.println(palindrome("aiiiia"));
		System.out.println(palindrome("다 같은 것은 같다"));

	}

	public static String palindrome(String str) {

		String result = "";
		String str2 = str.replace(" ", "");
		for (int i = 0, j = str2.length() - 1; i < str2.length() / 2; i++) {
			if (str2.charAt(i) == str2.charAt(j)) {
				j--;
			} else {
				result = "회문이 아닙니다.";
				break;
			}
			result = "회문입니다.";
		}

		return "'" + str + "'은(는) " + result;
	}

}
