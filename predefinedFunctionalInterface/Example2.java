package predefinedFunctionalInterface;


/*	Check the Object belong to respective type Not Solved*/


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Person{
	@Override
	public String toString() {
		return "Person";
	}
}
class Employee{
	@Override
	public String toString() {
		return "Employee []";
	}
}
class Worker{
	@Override
	public String toString() {
		return "Worker []";
	}
}
class Developer{
	@Override
	public String toString() {
		return "Developer []";
	}
}
class Tester{
	@Override
	public String toString() {
		return "Tester []";
	}
}


class Example2 {

	public static void main(String[] args) {
		List<Object> ls=new ArrayList<Object>();
		ls.add(new Person());
		ls.add(new Employee());
		ls.add(new Worker());
		ls.add(new Tester());
		ls.add(new Person());
		ls.add(new Developer());
		ls.add(new Employee());
		
		Predicate<Object> pr=o->o instanceof Person;
		
		for (int i=0;i<ls.size();i++) {
			if (pr.test(ls.get(i))) {
				System.out.println("List element "+(i+1)+" is a  Person Object");
			}
		}
		
		
		
	}

}
