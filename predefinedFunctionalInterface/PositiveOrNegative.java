package predefinedFunctionalInterface;

import java.util.function.Predicate;

class PositiveOrNegative {
	public static void main(String[] args) {
		Predicate<Integer> p=n->n>0;
		System.out.println("10 is positive "+p.test(10));
		System.out.println("-10 is positive "+p.test(-10));
		
	}
}
