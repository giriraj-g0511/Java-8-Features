package predefinedFunctionalInterface;

import java.util.function.Predicate;

class StringLength {
	public static void main(String[] args) {
		Predicate<String> p=s->s.length()==5;
		System.out.println(p.test("Hello"));
	}
}
