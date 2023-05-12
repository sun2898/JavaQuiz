package quiz13;

public class Circle extends Shape {

	/*
	 * 원은 radius 변수를 가진다. 원은 생성될 때 이름과, radius를 받을 수 있도록 생성자 선언 getArea() : 원의 너비를
	 * 구하도록 오버라이딩
	 */

	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * PI;
	}

}
