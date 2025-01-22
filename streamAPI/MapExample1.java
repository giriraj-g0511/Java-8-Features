package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MapExample1 {

	public static void main(String[] args) {
		List<Employee> ls=new ArrayList<Employee>();
		ls.add(new Employee(1001, "Anuj", 50000));
		ls.add(new Employee(1002, "Anjali", 180000));
		ls.add(new Employee(1003, "Rana", 800000));
		ls.add(new Employee(1004, "Arjun", 500000));
		ls.add(new Employee(1005, "Chiranjivi", 650000));
		ls.add(new Employee(1006, "Parth", 350000));
		ls.add(new Employee(1007, "Ramesh", 200000));
		ls.add(new Employee(1008, "Anil", 180000));
		ls.add(new Employee(1009, "Anuja", 800000));
		
		
		Stream<Employee> stream1= ls.stream();
		Stream<Employee> stream2=stream1.filter(emp->emp.salary>250000);
		Stream<Employee> stream3=stream2.map((emp)-> {emp.salary= (emp.salary*0.2)+emp.salary; return emp;});
		ls=stream3.collect(Collectors.toList());
		ls.forEach(s->System.out.println(s));
		
		
	}

}
