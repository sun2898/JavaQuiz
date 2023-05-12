package quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {

		/*
		 * 1. 스캐너를 통해서 파일명을 입력받는다. 2. 입력받은 파일을 filecopy로 복사해서 옮겨주면 된다.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("파일명 입력> ");
		String name = scan.next();
		String readPath = "C:\\Users\\sssoc\\Desktop\\course\\work\\file\\" + name;
		String writePath = "C:\\Users\\sssoc\\Desktop\\course\\work\\filecopy\\" + name;

		try (InputStream is = new FileInputStream(readPath); OutputStream out = new FileOutputStream(writePath)) {
			byte[] arr = new byte[100];

			int result;
			while ((result = is.read(arr)) != -1) {
				out.write(arr, 0, result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상종료");

	}

}
