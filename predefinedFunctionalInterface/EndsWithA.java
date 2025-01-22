package predefinedFunctionalInterface;

import java.util.function.Predicate;

class EndsWithA {

	public static void main(String[] args) {
		Predicate<String> p=s->s.charAt(s.length()-1)=='A'||s.charAt(s.length()-1)=='a';
		
		System.out.println(p.test("Prathamesh"));
		System.out.println(p.test("Ranka"));
	}

}
