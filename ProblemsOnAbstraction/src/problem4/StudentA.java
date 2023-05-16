package problem4;

public class StudentA extends Marks {
	double x, y, z;

	StudentA(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	void getPercentage() {
		double per = ((x + y + z) / 300) * 100;
		System.out.println("Prcentage is : " + per);

	}

}
