package streamAPI;

import java.util.ArrayList;
import java.util.List;

class Developer{
	String name;
	String role;
	double salary;
	public Developer(String name, String role, double salary) {
		super();
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
}


class FilterExample5 {

	public static void main(String[] args) {
		List<Developer> ls=new ArrayList<Developer>();
		ls.add(new Developer( "Anuj", "Java Developer",2.8));
		ls.add(new Developer( "Anjali","Tester", 8.8));
		ls.add(new Developer( "Rana", "Python Developer",8));
		ls.add(new Developer( "Arjun","SQL Developer", 5));
		ls.add(new Developer( "Chiranjivi","Java Developer", 6));
		ls.add(new Developer( "Parth", "Database Engineer",2.4));
		ls.add(new Developer( "Ramesh","Security ", 1.9));
		ls.add(new Developer( "Anil", "Admin",1.6));
		ls.add(new Developer( "Anuja", "Software Analyst",8));
		
		ls.stream().filter(job->job.role.equalsIgnoreCase("Java developer")).forEach(s->System.out.println(s));
		
		
	}

}
