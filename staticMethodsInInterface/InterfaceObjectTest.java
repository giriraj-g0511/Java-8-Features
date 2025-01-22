package staticMethodsInInterface;

interface Interface0{
	static void hello() {
		System.out.println("Hello from interface0");
	}
	int a=10;
	int b=10;
	int add();
}


public class InterfaceObjectTest {

	public static void main(String[] args) {
		Interface0 i= new Interface0() {
		public int add() {
			return 0;
		}
		};
		System.out.println(i.add());
		System.out.println(Interface0.a);
	}
	
}
