package problem8;

public class FountainPen extends Pen {

	@Override
	void write() {
		System.out.println("Write");

	}

	@Override
	void refill() {
		System.out.println("Refill");
	}
}
