package problem1;
public class Main {

	public static void main(String[] args) {
		Shape s = new Rectangle(10, 20);
		s.draw();
		s.calculateArea();
		Shape ss = new Triangle(10, 20);
		ss.draw();
		ss.calculateArea();

	}

}
