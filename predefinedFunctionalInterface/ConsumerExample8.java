package predefinedFunctionalInterface;

import java.util.function.Consumer;

class ConsumerExample8 {

	public static void main(String[] args) {
		Consumer<Integer> c=n->System.out.println(n);
		
		c.accept(10);
	}

}
