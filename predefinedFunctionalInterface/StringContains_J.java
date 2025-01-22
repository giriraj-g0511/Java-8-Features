package predefinedFunctionalInterface;

import java.util.function.Predicate;

class StringContains_J {

	public static void main(String[] args) {
		Predicate<String> p=s->s.contains("j")||s.contains("J");
		
		System.out.println(p.test("Joker"));
		System.out.println(p.test("Jani"));
		System.out.println(p.test("Dell"));
	}

}
