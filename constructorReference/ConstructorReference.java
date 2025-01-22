package constructorReference;

class Person{
	public Person() {
		System.out.println("Person Constructor");
	}
}

interface I1{
	Person m1();
}


class ConstructorReference {
	public static void main(String[] args) {
		I1 i=Person::new;
		Person p=i.m1();
		System.out.println(p);
	}
}
