package constructorReference;

class Employee{
	public Employee() {
		System.out.println("Employee Constructor");
	}
}

interface I3{
	Employee m1();
}

class LambdaExpression {
	public static void main(String[] args) {
		I3 i=()->{
			Employee e=new Employee();
			return e;
		};
		System.out.println(i.m1());
	}
}
