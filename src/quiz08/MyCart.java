package quiz08;

public class MyCart extends Cart {

	/*
	 * 1. 생성자는 money를 전달받고 money값 초기화 (tv = 300, computer = 400, radio = 500;)
	 *
	 * 2. buy(), add(), info() 메소드 오버라이드
	 * 
	 * 상품명 : "tv", "computer", "radio"
	 * 
	 * buy(상품명) 기능 매개변수가 tv, computer, radio 라면 금액에서 상품가격을 차감하고, add() 메소드를 실행 단,
	 * 올바른 상품이 아니거나, 금액이 부족할 경우에는 적절한 처리를 한다
	 * 
	 * add(상품명) 기능 매개변수로 넘어온 상품을 cart배열에 순서대로 담아준다 단, cart배열이 꽉 찼다면, 2배 크기의 카트 배열로
	 * 옮겨준다
	 * 
	 * 마지막에는 info() 메소드를 호출한다.
	 * 
	 * info()는 cart배열에 담긴 물건 목록만 출력(null 제외-toString사용 불가)
	 * 
	 */

	MyCart(int money) {
		this.money = money;
		this.tv = 300;
		this.computer = 400;
		this.radio = 500;
	}

	void buy(String product) {
		if (product.equals("tv") || product.equals("computer") || product.equals("radio")) {
			if (product.equals("tv")) {
				if (money >= 300) {
					money -= tv;
					this.add(product);
				} else
					System.out.println("금액이 부족합니다.");
			} else if (product.equals("computer")) {
				if (money >= 400) {
					money -= computer;
					this.add(product);
				} else
					System.out.println("금액이 부족합니다.");
			} else {
				if (money >= 500) {
					money -= radio;
					this.add(product);
				} else
					System.out.println("금액이 부족합니다.");
			}
		} else
			System.out.println("목록에 없는 상품입니다.");
	}

	void add(String product) {

		if (cart[cart.length - 1] != null) {

			String[] copyCart = new String[cart.length * 2];

			for (int i = 0; i < cart.length; i++) {
				copyCart[i] = cart[i];
			}
			cart = copyCart;
			copyCart = cart;
		}
		cart[i] = product;
		i++;
		info();
	}

	void info() {
		String str = "[";
		for (int j = 0; j < i; j++) {
			System.out.printf(cart[j] + " ");
			str += cart[j] + " ";
		}
		str += "]";

		System.out.println(str);
	}
}
