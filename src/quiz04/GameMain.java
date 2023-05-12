package quiz04;

public class GameMain {

	public static void main(String[] args) {

		Warrior warrior = new Warrior("user1");

		warrior.info();
		warrior.bash();
		warrior.info();

		Wizard wizard = new Wizard("user2");

		wizard.info();
		wizard.iceArrow();
		wizard.info();

	}
}
