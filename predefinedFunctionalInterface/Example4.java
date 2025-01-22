package predefinedFunctionalInterface;

/*	Checking the String is number or not*/




import java.util.function.Predicate;

class Example4 {
	public static void main(String[] args) {
		Predicate<String> p=s->{
			try {
				Integer.parseInt(s);
			} catch (NumberFormatException e) {
				return false;
			}
			return true;
		};
		
		System.out.println(p.test("10"));
		System.out.println(p.test("-10"));
		System.out.println(p.test("58"));
		System.out.println(p.test("9999"));
		System.out.println(p.test("Hello"));
		
	}
}
