package predefinedFunctionalInterface;

import java.util.function.Consumer;

class ConsumerExample3 {
	public static void main(String[] args) {
		Consumer<String> c=t->System.out.println(t.toUpperCase());
		
		
		c.accept("hello, world!");
	}
}
