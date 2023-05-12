package quiz05;

public class Calculator {

	int result;
	double pi = 3.14;

	void add(int x) {
		result += x;
	}

	void sub(int x) {
		result -= x;
	}

	double circle(int x) {

		return pi * x * x;
	}

	int array[] = new int[10];

	int a = array.length;

}
