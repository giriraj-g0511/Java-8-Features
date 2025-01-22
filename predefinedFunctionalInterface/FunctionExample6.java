package predefinedFunctionalInterface;

import java.util.function.Function;

class FunctionExample6 {

	public static void main(String[] args) {
		Function<String, String> f=t->new StringBuilder(t).reverse().toString();

		System.out.println(f.apply("Hello"));
		System.out.println(f.apply("Go Tata"));
		
	}

}
