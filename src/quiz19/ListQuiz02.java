package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>(); // 배열대체

		while (true) {
			System.out.println("1. 등록 | 2. 회원정보확인 | 3. 회원정보 검색 | 4.회원정보삭제 | 5. 프로그램 종료");
			System.out.print("메뉴(번호)> ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				// 이름, 나이를 입력받아서 user 객체에 저장, 리스트에 순서대로 추가
				System.out.print("이름> ");
				String name = scan.next();
				System.out.print("나이> ");
				int age = scan.nextInt();

				User user = new User(name, age);
				list.add(user);
				break;
			case 2:
				// 리스트에 담긴 모든 회원의 이름, 나이를 출력
				for (int i = 0; i < list.size(); i++) {

					User u = list.get(i);

					System.out.println(u.getName() + " " + u.getAge());
				}
				break;
			case 3:
				// 찾을 이름을 새롭게 입력받아서, 이름이 있다면 이름과 나이 출력
				// 찾는 이름이 없다면 "'찾는이름'은 목록에 없습니다." 출력
				System.out.print("찾을이름> ");
				String findName = scan.next();
				boolean bool = true;
				for (int i = 0; i < list.size(); i++) {

				}

				break;
			case 4:
				// 삭제할 이름을 입력받아서, 이름과 동일한 User객체를 1개만 삭제
				System.out.print("삭제할 이름> ");
				String deleteName = scan.next();
				for (int i = 0; i < list.size(); i++) {

					User u = list.get(i);

					if (u.getName().equals(deleteName)) {
						list.remove(i);
						break;
					}
				}
				break;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;

			default:
				System.out.println("메뉴에 맞는 번호를 입력하세요");
				break;
			}

		}

	}
}
