package predefinedFunctionalInterface;
/*	 Function */
import java.util.function.Function;

class MultiplicationWith2 {
	public static void main(String[] args) {
		Function<Integer, Integer> f=a->a*2;

		System.out.println("3 : "+f.apply(3));
		System.out.println("8 : "+f.apply(8));
	}
}
