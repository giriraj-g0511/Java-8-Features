package predefinedFunctionalInterface;

import java.util.function.Predicate;

class EvenOrOdd {
	public static void main(String[] args) {

		Predicate<Integer> p = n -> n % 2 == 0;

		System.out.println("is 10 Even " + p.test(10));

		System.out.println("is 1 Even " + p.test(1));
	}
}
