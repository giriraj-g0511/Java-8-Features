package methodReference;

interface Runnable{
	void run();
}


public class Example1 {
	public static void helloRun() {
		System.out.println("static method helloRun");
	}
	
	public void hiiRun() {
		System.out.println("non-static hiiRun");
	}
	
	public static void main(String[] args) {
		Runnable r1=()->System.out.println("Run method using lambda expression");
		r1.run();
		
		System.out.println();
		System.out.println();
		
		System.out.println("non-static method reference");
		Runnable r2=new Example1()::hiiRun;
		r2.run();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Static method reference");
		Runnable r3=Example1::helloRun;
		r3.run();
		
	}
}
