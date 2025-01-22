package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

class FilterExample2 {

	public static void main(String[] args) {
		List<Employee> ls=new ArrayList<Employee>();
		ls.add(new Employee(1001, "Anuj", 2.8));
		ls.add(new Employee(1001, "Anjali", 8.8));
		ls.add(new Employee(1001, "Rana", 8));
		ls.add(new Employee(1001, "Arjun", 5));
		ls.add(new Employee(1001, "Chiranjivi", 6));
		ls.add(new Employee(1001, "Parth", 2.4));
		ls.add(new Employee(1001, "Ramesh", 1.9));
		ls.add(new Employee(1001, "Anil", 1.6));
		ls.add(new Employee(1001, "Anuja", 8));
		
		
		ls.stream().filter(emp->emp.salary>2.5).collect(Collectors.toList()).forEach(s->System.out.println(s));
		
		
	}

}
