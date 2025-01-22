package staticMethodsInInterface;

interface AnimalInterface {

	void sound();

	default void eat() {
		System.out.println("can eat both veg & non-veg");
	}
	
	default void walk() {
		System.out.println("Walk on 4 legs");
	}

	public static void drink() {
		System.out.println("Can't survive without Water");
	}

	public static void sleep() {
		System.out.println("Can't survive without Sleep");
	}
}

class Human implements AnimalInterface {

	@Override
	public void sound() {
		System.out.println("Any");
	}
	
	@Override
	public void walk() {
		System.out.println("walk on 2-legs");
	}

}

class Lion implements AnimalInterface {
	@Override
	public void eat() {
		System.out.println("Non-Veg");
	}

	@Override
	public void sound() {
		System.out.println("Roar");
	}
}

class Elephant implements AnimalInterface {
	@Override
	public void eat() {
		System.out.println("Veg");
	}

	@Override
	public void sound() {
		System.out.println("Trumpet");
	}
}

class Dog implements AnimalInterface {

	@Override
	public void sound() {
		System.out.println("Bark");
	}
}

class Cat implements AnimalInterface {

	@Override
	public void sound() {
		System.out.println("Meow");
	}
}

public class Animal {

	public static void main(String[] args) {
		
		System.out.println("Human:");
		Human h = new Human();
		h.eat();
		AnimalInterface.drink();
		h.sound();
		h.walk();
		AnimalInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Lion:");
		Lion l = new Lion();
		l.eat();
		AnimalInterface.drink();
		l.sound();
		l.walk();
		AnimalInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Elephant:");
		Elephant e = new Elephant();
		e.eat();
		AnimalInterface.drink();
		e.sound();
		e.walk();
		AnimalInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Dog:");
		Dog d = new Dog();
		d.eat();
		AnimalInterface.drink();
		d.sound();
		d.walk();
		AnimalInterface.sleep();

		System.out.println("-------------------------------\n");

		System.out.println("Cat:");
		Cat c = new Cat();
		c.eat();
		AnimalInterface.drink();
		c.sound();
		c.walk();
		AnimalInterface.sleep();

	}

}
