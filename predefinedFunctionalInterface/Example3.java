package predefinedFunctionalInterface;


/*	Checking the gender and Print them separately*/


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Human{
	String name;
	String gender;
	public Human(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", gender=" + gender + "]";
	}
	
}

interface HumanProtocol{
	Human createHuman(String name,String gender);
}

class Example3 {
	public static void main(String[] args) {
		HumanProtocol hm=Human::new;
		
		List<Human> ls=new ArrayList<Human>();
		ls.add(hm.createHuman("Ramesh", "Male"));
		ls.add(hm.createHuman("Reshma", "Female"));
		ls.add(hm.createHuman("Mahesh", "Male"));
		ls.add(hm.createHuman("Dilip", "Male"));
		ls.add(hm.createHuman("Gunjan", "Female"));
		ls.add(hm.createHuman("Rajiv", "Male"));
		ls.add(hm.createHuman("Dipika", "Female"));
		ls.add(hm.createHuman("Shital", "Female"));
		
		Predicate<Human> p=h->h.getGender()=="Male";
		
		System.out.println("Mens are:");
		for (Human human : ls) {
			if (p.test(human)) {
				System.out.println(human.getName());
			}
		}
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		
		System.out.println("Womens are:");
		for (Human human : ls) {
			if (!p.test(human)) {
				System.out.println(human.getName());
			}
		}
		
	}
}
