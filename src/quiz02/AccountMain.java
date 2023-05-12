package quiz02;

public class AccountMain {

	public static void main(String[] args) {

		Account person01 = new Account("P0120230420", "1234", 3000);

		person01.info();

		person01.deposit(-50000);

		System.out.println(person01.getBalance());

		person01.deposit(550000);

		person01.withDraw(5323500);

		person01.withDraw(34500);

		System.out.println(person01.getBalance());

		person01.deposit(1300);

		person01.info();

	}
}
