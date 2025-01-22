package methodReference;

interface ReferenceExample0Interface{
	void greet();
}

class ReferenceExample0Implements{
	public static void greeting() {
		System.out.println("Welcome to these package from ReferenceExample0Implements class");
	}
}

public class ReferenceExample0 {
	public static void main(String[] args) {
		
		//Using Lambda Expression / Function
		ReferenceExample0Interface rei=()->System.out.println("Welcome to these package from lambda expression");
		rei.greet();
		
		//Using the double colon operator or static method reference
		ReferenceExample0Interface rei0 = ReferenceExample0Implements::greeting;
		rei0.greet();
		
		Runnable r=ReferenceExample0Implements::greeting;
		r.run();
	}
}
