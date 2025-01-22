package predefinedFunctionalInterface;

import java.util.function.Predicate;

class NoIsInRange {

	public static void main(String[] args) {
		Predicate<Integer> p=n->n>10&&n<30;

		System.out.println(p.test(15));
		System.out.println(p.test(55));
	}

}
