package staticMethodsInInterface;

interface BirdInterface {
	
	void sound();

	default void walk() {
		System.out.println("can walk");
		
	}
	
	default void fly() {
		System.out.println("can fly in Sky");
	}
	
	default void eat() {
		System.out.println("can eat veg and non-veg");
	}

	public static void drink() {
		System.out.println("can't survive without Water");
	}

	public static void sleep() {
		System.out.println("can't survive without Sleep");
	}
}

class Sparrow implements BirdInterface {

	@Override
	public void sound() {
		System.out.println("can sounds like cheep or chirrup notes");
	}

}

class Pienguin implements BirdInterface {
	@Override
	public void eat() {
		System.out.println("eat only non veg");
	}
	
	@Override
	public void fly() {
		System.out.println("Have wings but cant fly");
	}
	
	@Override
	public void walk() {
		System.out.println("can walk and swim also");
	}
	
	@Override
	public void sound() {
		System.out.println("can sounds like kli-kli");
	}
}

class Kingfisher implements BirdInterface {

	@Override
	public void eat() {
		System.out.println("eat only non veg");
	}
	
	@Override
	public void sound() {
		System.out.println("can sounds like Trumpet");
	}
}

class Eagle implements BirdInterface {

	@Override
	public void eat() {
		System.out.println("can eat only non veg");
	}
	
	@Override
	public void sound() {
		System.out.println("can sounds like a screech");
	}
}

class Peacock implements BirdInterface {

	@Override
	public void sound() {
		System.out.println("can sounds like Meow-Meow");
	}
}

public class Birds {

	public static void main(String[] args) {
		
		System.out.println("Sparrow:");
		Sparrow sp = new Sparrow();
		sp.eat();
		sp.sound();
		sp.walk();
		sp.fly();
		BirdInterface.drink();
		BirdInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Pienguin:");
		Pienguin pi = new Pienguin();
		pi.eat();
		pi.sound();
		pi.walk();
		pi.fly();
		BirdInterface.drink();
		BirdInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Kingfisher:");
		Kingfisher ki = new Kingfisher();
		ki.eat();
		ki.sound();
		ki.walk();
		ki.fly();
		BirdInterface.drink();
		BirdInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Eagle:");
		Eagle ea = new Eagle();
		ea.eat();
		ea.sound();
		ea.walk();
		ea.fly();
		BirdInterface.drink();
		BirdInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Peacock");
		Peacock pe = new Peacock();
		pe.eat();
		pe.sound();
		pe.walk();
		pe.fly();
		BirdInterface.drink();
		BirdInterface.sleep();		
	}

}
