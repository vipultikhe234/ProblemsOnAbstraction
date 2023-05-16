package problem1;
public abstract class Shape {
	int x;
	int y;

	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract void draw();

	abstract void calculateArea();
}
