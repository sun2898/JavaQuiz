package quiz06;

public class AccountMain {

	public static void main(String[] args) {

		MyAccount ac = new MyAccount();

		// "P0120230420", "1234", 3000
		ac.accountNumber = "P0120230420";
		ac.password = "1234";
		ac.balance = 3000;

		ac.info();

		ac.withDraw(2000);
	}
}
