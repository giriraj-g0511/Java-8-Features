package constructorReference;

class Student1{
	int id;
	
	public Student1() {
		System.out.println("From no argument constructor");
	}

	public Student1(int id) {
		this.id=id;
		System.out.println("From argument constructor");
		System.out.println("Value passed is: "+id);
	}
}

interface I4{
	Student1 createStudent(int id);
//	Student createStudent();
}

class Example1 {
	public static void main(String[] args) {
		I4 i=Student1::new;
		System.out.println(i.createStudent(1));
//		System.out.println(i.createStudent());
	}
}
