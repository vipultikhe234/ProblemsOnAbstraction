package problem5;

public abstract class BaseClass {
	BaseClass() {
		System.out.println("This is the constructor of abstract class");
	}

	abstract void a_method();

	void a_method1() {
		System.out.println("This is a normal method of abstract class");
	}

}
