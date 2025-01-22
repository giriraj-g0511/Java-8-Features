package predefinedFunctionalInterface;

import java.util.function.Predicate;

class StringStartWith_H {

	public static void main(String[] args) {
		Predicate<String> p=s->s.charAt(0)=='H'||s.charAt(0)=='h';
		System.out.println(p.test("Help"));
		System.out.println(p.test("Kill"));

		System.out.println(p.test("help"));
	}

}
