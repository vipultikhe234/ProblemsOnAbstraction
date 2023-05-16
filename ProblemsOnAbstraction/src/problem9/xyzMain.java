package problem9;
public class xyzMain extends xyz {
	public static void main(String[] args) {
		System.out.println(xyz.x);
		xyzMain x = new xyzMain();
		x.m1();
	}
	@Override
	public void m1() {
		System.out.println("HEllo");
	}
}
