package quiz14;

public class MainClass {

	public static void main(String[] args) {

		Marine marine = new Marine();

		System.out.println(marine.getHp());
		System.out.println(marine.getX());
		System.out.println(marine.getY());

		marine.location();
		marine.move(3, 4);
		marine.move(2, 6);
		marine.move(-3, -4);

	}

}
