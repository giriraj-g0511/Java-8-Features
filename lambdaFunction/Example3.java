package lambdaFunction;

@FunctionalInterface
interface Discount{
	String discoutApplicable(int age);
}


public class Example3 {
	
	public static void main(String[] args) {
		Discount d=(age)-> age>=60?"Discount is Applicable":"Discount is Not Applicable";
		System.out.println(d.discoutApplicable(16));
		System.out.println(d.discoutApplicable(61));
	}
}
