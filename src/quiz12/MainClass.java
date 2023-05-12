package quiz12;

public class MainClass {

	public static void main(String[] args) {

		Product tv = new Tv();
		Product radio = new Radio();
		Product computer = new Computer();

		MyCart mycart = new MyCart(5000);

		mycart.buy(tv);

		mycart.buy(radio);

		mycart.buy(computer);

	}
}
