package lambdaFunction;

interface Voter{
	String isEligibleOrNot(int age);
}

public class Example2 {

	public static void main(String[] args) {
		
//		Voter v=(age)->{
//			if (age>18) {
//				return "Eligible to Vote";
//			}
//			return "Not Eligible to Vote";
//		};
		
		Voter v=(age)->age>18?"Eligible to Vote":"Not Eligible to Vote";
		
		System.out.println(v.isEligibleOrNot(18));
		System.out.println(v.isEligibleOrNot(81));
		
	}
}
