
package problem1;
public class Rectangle extends Shape {

	Rectangle(int x, int y) {
		super(x, y);

	}

	@Override
	void draw() {
		System.out.println("Drawing rectangle");

	}

	@Override
	void calculateArea() {
		System.out.println("Area of rectangle is " + x * y);

	}

}
