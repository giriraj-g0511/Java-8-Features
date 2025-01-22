package predefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionExample5 {
	public static void main(String[] args) {
		Function<String, Integer> f=t->t.length();
		
		System.out.println("Length of 'Hello' : "+f.apply("Hello"));
	}
}
