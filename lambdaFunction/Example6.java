package lambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	Comparable<Employee> comparable = s -> this.name.compareTo(s.name);

	@Override
	public int compareTo(Employee o) {
		return comparable.compareTo(o);
	}

	@Override
	public String toString() {
		return "[" + "id=" + id + ", name='" + name + ']';
	}
}

public class Example6 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(40, "aass"));
		list.add(new Employee(24, "ssaa"));
		list.add(new Employee(21, "qqww"));
		list.add(new Employee(98, "qwe"));
		list.add(new Employee(99, "qwe"));
//        Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
		Collections.sort(list);
		System.out.println(list);
	}
}