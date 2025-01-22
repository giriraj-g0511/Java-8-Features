package predefinedFunctionalInterface;

import java.util.function.Function;

class FunctionExample8 {

	public static void main(String[] args) {
		Function<String, Boolean> f=t->t.contains("h");

		System.out.println(f.apply("hello"));
		System.out.println(f.apply("Hello"));
	}

}
