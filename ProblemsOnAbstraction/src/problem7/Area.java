package problem7;

public class Area extends Shape {

	@Override
	void rectangleArea(int x, int y) {
		System.out.println("Area of rectangle is " + x * y);
	}

	@Override
	void squareArea(int x) {
		System.out.println("Area of Square is " + x * x);

	}

	@Override
	void circleArea(int x) {
		final double pi = 3.14;
		System.out.println("Area of circle is " + pi * x * x);

	}

}
