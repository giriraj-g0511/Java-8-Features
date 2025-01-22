package predefinedFunctionalInterface;

import java.util.function.Function;

class FunctionExample1 {

	public static void main(String[] args) {
		Function<Integer, Integer> f= t->t*3;
		
		System.out.println("2 : "+f.apply(2));
		System.out.println("9 : "+f.apply(9));
	}

}
