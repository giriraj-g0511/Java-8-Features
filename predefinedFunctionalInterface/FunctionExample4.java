package predefinedFunctionalInterface;

import java.util.function.Function;

class FunctionExample4 {

	public static void main(String[] args) {
		Function<String, String> f=t->{
			try {
				return t.substring(0, 2);
				
			} catch (Exception e) {
				return null;
			}
		};
		
		System.out.println("First 2 char of 'Hello' :"+f.apply("Hello"));
		System.out.println("First 2 char of '-' :"+f.apply("-"));
	}

}
