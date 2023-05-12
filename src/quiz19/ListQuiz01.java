package quiz19;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {

		/*
		 * List 1번 1. list에 1~20까지 값을 순서대로 저장 2. list에 값을 순서대로 출력.
		 */

		/*
		 * List 2번 1. User를 저장하는 list생성 2. 3개의 각각 다른 User객체를 만들고 순서대로 저장 3. User객체 안에
		 * 홍길동이 있으면 해당 객체의 name, age를 출력하는 코드 4. User객체 안에 홍길자가 있으면 해당 객체를 삭제하는 코드
		 * 
		 */

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		List<User> userList = new ArrayList<>();

		User user1 = new User("이순신", 2);
		userList.add(user1);

		User user2 = new User("홍길동", 30);
		userList.add(user2);

		User user3 = new User("홍길자", 40);
		userList.add(user3);

		System.out.println(userList.toString());

		for (int i = 0; i < 3; i++) {

			User u = userList.get(i);

			if (u.getName().equals("홍길동")) {
				System.out.println(u.getName() + " " + u.getAge());
			}
		}

		for (int i = 0; i < userList.size(); i++) {
			User u = userList.get(i);
			if (u.getName().equals("홍길자")) {
				userList.remove(i);
			}
		}

		System.out.println(userList.toString());

	}
}
