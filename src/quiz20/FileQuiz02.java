package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20200421file 폴더를 생성합니다 2. 스캐너로 파일명을 입력받고
		 * BufferedWriter를 이용해서 .txt파일을 생성합니다. 3. 그만을 입력받을 때 까지 엔터를 포함해서 입력 받습니다. \r\n을
		 * 적절하게 이용해서 파일 출력을 완료 4. 파일을 다 썼다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */
		Scanner scan = new Scanner(System.in);

		Date date = new Date();

		SimpleDateFormat formatType = new SimpleDateFormat("yyyyMMdd");

		String day = formatType.format(date);

		String path = "C:\\Users\\sssoc\\Desktop\\course\\work\\file\\" + day + "file";

		try {
			File file = new File(path);

			file.mkdir();
			System.out.println("폴더가 생성되었습니다.");
			System.out.println("------------------------------");

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.print("생성할 파일명을 입력하세요: ");
		String name = scan.next();
		scan.nextLine();

		String path2 = "C:\\Users\\sssoc\\Desktop\\course\\work\\file\\" + day + "file\\" + name + ".txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2, true))) {
			String word = "";
			while (true) {
				System.out.print("> ");
				word = scan.nextLine() + "\n";
				if (word.equals("그만\n")) {
					break;
				} else
					bw.write(word);
				bw.flush();
			}

			System.out.println("입력이 종료되었습니다.");
			System.out.println("------------------------------");

		} catch (Exception e) {
			e.printStackTrace();
		}

		scan.close();

		try (BufferedReader br = new BufferedReader(new FileReader(path2))) {

			String result;
			while ((result = br.readLine()) != null) {
				System.out.println(result);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
