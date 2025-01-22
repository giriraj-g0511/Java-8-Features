package predefinedFunctionalInterface;

import java.util.function.Function;

class FunctionExample3 {
	public static void main(String[] args) {
		Function<String, Character> f=t->{
			try {
				return t.charAt(0);
			} catch (Exception e) {
				return null;
			} 
		};

		System.out.println("First char of 'Hello' :"+f.apply("Hello"));
		System.out.println("First char of '-' :"+f.apply("-"));
	}
}
