package quiz05;

public class Computer extends Calculator {

	double circle(int x) {
		return Math.PI * x * x;
	}

	double rect(double a) {
		return a * a;
	}

	double rect(double a, double b) {
		return a * b;
	}

	double rect(double a, double b, double c) {
		return 2 * (a * b + a * c + b * c);
	}
}
