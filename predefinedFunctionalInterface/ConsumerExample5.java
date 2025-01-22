package predefinedFunctionalInterface;

import java.util.function.Consumer;

class ConsumerExample5 {

	public static void main(String[] args) {
		Consumer<Integer> c=n->{
			System.out.println("Table of "+n);
			for (int i = 1; i < 11; i++) {
				System.out.println(n+" X "+i+" = "+n*i);
				
			}
		};
		
		c.accept(7);
		
	}

}
