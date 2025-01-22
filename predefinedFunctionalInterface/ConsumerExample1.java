package predefinedFunctionalInterface;

import java.util.function.Consumer;

class ConsumerExample1 {

	public static void main(String[] args) {
		Consumer<Object> c=t->System.out.println(t);
		
		c.accept(10);
		
		c.accept("Hello");
	}

}
