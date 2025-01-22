package lambdaFunction;

import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Example0 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 20)
        );

        // Custom comparator to compare by name
        Comparator<Person> nameComparator = (p1, p2) -> p1.name.compareTo(p2.name);
        Collections.sort(people, nameComparator); // Sort using custom comparator (name)
        System.out.println(people);

        // Sort by age using a lambda expression
        people.sort((p1, p2) -> Integer.compare(p1.age, p2.age)); // Lambda for sorting by age
        System.out.println(people);
    }
}
