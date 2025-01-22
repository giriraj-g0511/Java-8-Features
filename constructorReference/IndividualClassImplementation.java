package constructorReference;

class Student{
	public Student() {
		System.out.println("Student Constructor");
	}
}

interface I2{
	Student m1();
}

public class IndividualClassImplementation implements I2{
	@Override
	public Student m1() {
		Student s=new Student();
		return s;
	}
	public static void main(String[] args) {
		IndividualClassImplementation i1=new IndividualClassImplementation();
		System.out.println(i1.m1());
	}
}
