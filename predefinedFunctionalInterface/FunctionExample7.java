package predefinedFunctionalInterface;

import java.util.function.Function;

class FunctionExample7 {

	public static void main(String[] args) {
		Function<Integer, Integer> f=t->{
			if (t>2024) {
				System.out.print("Wrong Input");
				return 0;
			}
			return 2024-t;
		};
		
		System.out.println(f.apply(1915));
		System.out.println(f.apply(9825));
	}

}
