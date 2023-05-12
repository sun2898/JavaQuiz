package quiz11;

public class MainClass {

	public static void main(String[] args) {

		// Computer c = new Computer();

		KeyBoard key = new KeyBoard();
		Mouse mouse = new Mouse();
		Monitor monitor = new Monitor();

		Computer c = new Computer(key, monitor, mouse);
		c.computerInfo();

		Monitor m = c.getMonitor();
		m.info();
		System.out.println(m); // 주소값

	}
}
