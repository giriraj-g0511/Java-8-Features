package predefinedFunctionalInterface;


/*	for boolean operation on 1 variable before Predicate interface */
interface CheckNumber{
	boolean check(int n);
}

class Child implements CheckNumber{
	public boolean check(int j) {
		return j%2==0;
	}
}
/***************************************/

/*	for generic operation on 1 variable before Function interface*/
interface Multiplication{
	int multiply(int n);
}

class MultiplicationChild implements Multiplication{
	public int multiply(int j) {
		return j*2;
	}
}

/***************************************/


public class BeforeJDK8 {
	public static void main(String[] args) {
		
		/*	boolean operation on 1 variable */
		Child c= new Child();
		System.out.println("is 10 Even : "+c.check(10));
		System.out.println("is 1 Even : "+c.check(1));
		
		/*	for generic operation on 1 variable */
		MultiplicationChild mc=new MultiplicationChild();
		System.out.println("3 : "+mc.multiply(3));
		System.out.println("8 : "+mc.multiply(8));
		
		
		/**/
	}
}
