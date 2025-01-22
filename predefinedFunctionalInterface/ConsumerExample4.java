package predefinedFunctionalInterface;

import java.util.function.Consumer;

class ConsumerExample4 {

	public static void main(String[] args) {
		Consumer<Integer> c=n->System.out.println("Sqaure of "+n+" is : "+n*n);
		
		c.accept(7);
	}

}
