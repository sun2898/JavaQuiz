package quiz15;

public class Item implements IBag {

	String[] arr = new String[100];
	int index = 0;

	@Override
	public void insert(String item) { // 저장 - 매개변수를 배열에 순서대로 저장

		arr[index] = item;
		index++;
	}

	@Override
	public void print() { // 출력 - 배열안에 개수만큼 출력
		System.out.print("[");
		for (int n = 0; n < index - 1; n++) {
			System.out.print(arr[n] + ", ");
		}
		System.out.print(arr[index - 1]);
		System.out.println("]");
	}

	@Override
	public int search(String item) { // 검색 - 값이 있다면 index를 return, 없다면 -1을 리턴(가장먼저 검색된 item순서 반환)

		int result = 0;

		for (int i = 0; i < index; i++) {
			if (arr[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean delete(String item) { // 삭제 - 배열의 요소를 삭제(가장먼저 찾게된 item하나만 삭제)

		for (int i = 0; i < index; i++) {
			// 찾은경우
			if (arr[i].equals(item)) {
				for (int j = i; j < index - 1; j++) {
					arr[j] = arr[j + 1];
				}

				arr[index - 1] = null;
				index--;
				return true;
			}
		}
		return false;
	}

}
