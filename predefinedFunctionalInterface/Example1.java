package predefinedFunctionalInterface;


/*	Student Percentage Solved*/



import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	

}

interface StudentProtocol {
	Student student(int id, String name, double per);
}

class Example1 {

	public static void main(String[] args) {

		StudentProtocol sp=Student::new;
		Student s1=sp.student(1, "QWE", 98);
		Student s2=sp.student(2, "POI", 35);
		Student s3=sp.student(3, "VBN", 23);
		Student s4=sp.student(4, "ZXC", 60);
		Student s5=sp.student(5, "ASD", 70);
		
		List<Student> ls=new ArrayList<Student>();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		ls.add(s5);
		
		Predicate<Student> p=s->s.getPercentage()>=60;
		for(Student student: ls) {
			if (p.test(student)) {
				System.out.println(student.toString());
			}
		}
		
	}

}
