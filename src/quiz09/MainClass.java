package quiz09;

public class MainClass {

	public static void main(String[] args) {

		SuperSonicAp ap = new SuperSonicAp("A6");

		ap.fly();

		ap.flyMode = 1;

		ap.fly();

		System.out.println(ap.info());

	}
}
