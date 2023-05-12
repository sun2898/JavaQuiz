package quiz15;

public class MainClass {

	public static void main(String[] args) {

		IBag b1 = new Item();

		b1.insert("핸드폰");
		b1.insert("필통");
		b1.insert("텀블러");
		b1.print();
		System.out.println(b1.search("필통"));
		System.out.println(b1.search("핸드폰"));
		b1.delete("필통");
		b1.print();

	}
}
