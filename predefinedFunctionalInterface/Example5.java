package predefinedFunctionalInterface;

/*	Power Saving mode Program*/


import java.util.Scanner;
import java.util.function.Predicate;

class Example5 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Predicate<Integer> p=i->i<=20;
		
		System.out.println("Enter Mobile charging:");
		int i=sc.nextInt();
		
		
		if (p.test(i)) {
			System.out.println("Turn on Power Saving Mode");
		} else {
			System.out.println("Enjoy");
		}
		sc.close();
	}
}
