package predefinedFunctionalInterface;

import java.util.function.Predicate;

class PredicateEvenNo {

	public static void main(String[] args) {
		Predicate<Integer> p=n -> n%2==0&&n>0;
		
		int[] ar= {10,8,2,7,9,5,3,4,-10};
		
		for (int i : ar) {
			if (p.test(i)) {
				System.out.println(i+" is Even");
			}
		}
	}

}
