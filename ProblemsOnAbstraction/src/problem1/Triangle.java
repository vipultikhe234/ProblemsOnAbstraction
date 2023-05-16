package problem1;

public class Triangle extends Shape {

	Triangle(int x, int y) {
		super(x, y);
	}

	@Override
	void draw() {
		System.out.println("Drawing triangle");
		
	}

	@Override
	void calculateArea() {
		System.out.println("Area of triangle is "+0.5*x*y);
		
	}

}
