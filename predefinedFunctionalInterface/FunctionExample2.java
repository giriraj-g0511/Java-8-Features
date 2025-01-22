package predefinedFunctionalInterface;

import java.util.function.Function;

class FunctionExample2 {
	public static void main(String[] args) {
		Function<Integer, Integer> f=t->t*t;
		
		System.out.println("5 : "+f.apply(5));
		System.out.println("7 : "+f.apply(7));
	}
}
