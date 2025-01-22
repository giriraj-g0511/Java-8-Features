package lambdaFunction;

@FunctionalInterface
interface Authorization{
	String personIsAuthorizedOrNot(String role);
}


public class Example4 {

	public static void main(String[] args) {
		Authorization a=(role)-> role.equalsIgnoreCase("Admin")?"Access Granted":"Access Declined";

		System.out.println(a.personIsAuthorizedOrNot("adMIN"));
		System.out.println(a.personIsAuthorizedOrNot("HR"));
	
	}
}
