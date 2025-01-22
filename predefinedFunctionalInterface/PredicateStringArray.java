package predefinedFunctionalInterface;

import java.util.function.Predicate;

class PredicateStringArray {
	public static void main(String[] args) {
		Predicate<String> p=s->s.length()==4;
		String[] ar= {"Java","MERN","Python","Ruby",".Net","MEAN","NODE-JS"};
		
		for (String string : ar) {
			if (p.test(string)){
				System.out.println(string);
			}
		}
		
	}
}
