package quiz13;

public class MainClass {

	public static void main(String[] args) {

		Shape s1 = new Circle("원", 3);
		Shape s2 = new Rect("네모", 5);

		System.out.println("원의 넓이는 " + s1.getArea());
		System.out.println("사각형의 넓이는 " + s2.getArea());

	}

}
