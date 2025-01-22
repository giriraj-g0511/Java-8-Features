package streamAPI;

import java.util.ArrayList;
import java.util.List;

class Teacher{
	String name;
	String subject;
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	
	
}


class FilterExample4 {

	public static void main(String[] args) {
		
		List<Teacher> teacher=new ArrayList<Teacher>();

		teacher.add(new Teacher("Pavan", "JAVA 8"));
		teacher.add(new Teacher("Tejus", "JAVA"));
		teacher.add(new Teacher("Sandip", "Adv JAVA"));
		teacher.add(new Teacher("Vikas", "SQL"));
		teacher.add(new Teacher("Raviteja", "SQL"));
		teacher.add(new Teacher("Shrikant", "WebTech"));
		
		teacher.stream().filter(s->s.name.length()==5).forEach(s->System.out.println(s));
		
		
	}

}
