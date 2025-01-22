package lambdaFunction;

public class RunnableInterface {
	public static void main(String[] args) {
		
		Runnable r=()->System.out.println("From Runnable Interface");
		
		r.run();
		System.out.println(r.toString());
//		((Object) r).finalize();
		System.out.println(r.hashCode());
	}
}
