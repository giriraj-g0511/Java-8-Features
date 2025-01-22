package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int rollNo;
	String name;
	String city;
	
	public Student(int rollNo, String name, String city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", city=" + city + "]";
	}	
	
}



public class FilterExample3 {

	public static void main(String[] args) {
		List<Student> stu=new ArrayList<Student>();
		stu.add(new Student(1,"Anand","Mumbai"));
		stu.add(new Student(2,"Angad","BLR"));
		stu.add(new Student(3,"Anil","Pune"));
		stu.add(new Student(4,"Bablu","DL"));
		stu.add(new Student(5,"Chaman","HYB"));
		stu.add(new Student(6,"Dyani","Pune"));
		stu.add(new Student(7,"Fanty","BLR"));
		stu.add(new Student(8,"Ganesh","SLPR"));
		
		stu.stream().filter(student->student.city.equalsIgnoreCase("Pune")||student.city.equalsIgnoreCase("BLR")).collect(Collectors.toList()).forEach(s->System.out.println(s));
		
		
	}

}
