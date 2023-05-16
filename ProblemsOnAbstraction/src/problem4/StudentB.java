package problem4;
public class StudentB extends Marks {
	double x, y, z, w;

	StudentB(double x, double y, double z, double w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}

	@Override
	void getPercentage() {
		double per = ((x + y + z + w) / 400) * 100;
		System.out.println("Prcentage is : " + per);

	}
}
