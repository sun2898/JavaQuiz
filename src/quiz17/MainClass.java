package quiz17;

public class MainClass {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		try {
			System.out.println(cal.input());

		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}
