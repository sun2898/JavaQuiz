package quiz22;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {

		String str = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,000원";

		String pattern1 = "\\d{6}-\\d{7}";
		String pattern2 = "[A-Z]{2}[0-9]{2}";
		String pattern3 = "\\([가-힣0-9]+\\)";
		String pattern4 = "\\d,*\\d+원";
		String pattern5 = "\\d{8}-\\d{2}-\\d{12,13}";
		String pattern6 = "[가-힣\\s]+";
		String pattern7 = "\\[[A-Z가-힣]+\\]";
		String pattern8 = "\\d+,*\\d+원";
		
		
		String str3 = "20180429-02-002420180429 건담베이스 강남점 [HG] 1/144 건탱크 초기타입 (오리진ver.) 1 20400원";
		String str4 = str3.substring(str3.indexOf("]")+2, str3.lastIndexOf(" "));
		System.out.println(str4);
		
		

		Matcher m5 = Pattern.compile(pattern5).matcher(str3);
		Matcher m6 = Pattern.compile(pattern6).matcher(str3);
		Matcher m7 = Pattern.compile(pattern7).matcher(str3);
		Matcher m8 = Pattern.compile(pattern8).matcher(str3);
		

		if (m7.find() && m8.find()) {
			System.out.println(m7.group());
			System.out.println(str3);
			System.out.println(m8.group());
		}
		
		

//		List<String> list = Arrays.asList(str, str2);
//
//		for (int i = 0; i < list.size(); i++) {
//			String result = list.get(i);
//
//			Matcher m1 = Pattern.compile(pattern1).matcher(result);
//			Matcher m2 = Pattern.compile(pattern2).matcher(result);
//			Matcher m3 = Pattern.compile(pattern3).matcher(result);
//			Matcher m4 = Pattern.compile(pattern4).matcher(result);
//
//			if (m1.find() && m2.find() && m3.find() && m4.find()) {
//				System.out.println(m1.group());
//				System.out.println(m2.group());
//				System.out.println(m3.group());
//				System.out.println(m4.group());
//			}
//
//		}

	}

}
