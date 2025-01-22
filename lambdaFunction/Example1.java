package lambdaFunction;

@FunctionalInterface
interface Display {
	void display();
}

public abstract class Example1 implements Display {

	/*
	 * 
	 * @Override public void display() { System.out.println("Display"); }
	 * 
	 */
	public static void main(String[] args) {
		Display d = () -> System.out.println("From Lambda class");

		d.display();
	}
}
