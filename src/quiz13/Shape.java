package quiz13;

public abstract class Shape {

	public static final double PI = 3.14;
	private String name;

	public Shape(String name) {
		this.name = name;
	}

	// 추상메서드의 형태 - 자식 클래스에서 오버라이딩 필요함
	public abstract double getArea();

	public String getName() {
		return "도형이름: " + name;
	}

}
