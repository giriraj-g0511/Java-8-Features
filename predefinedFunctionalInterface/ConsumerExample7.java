package predefinedFunctionalInterface;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Consumer;

class ConsumerExample7 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Consumer<String> c=s->System.out.println(s);
		try {
		c.accept("Enter a number and i will print it's square");
		int n=sc.nextInt();
		c.accept("Sqaure of "+n+" is : "+n*n);
		}
		catch(InputMismatchException e) {
			c.accept("Enter only number unpadh");
		}
		
		sc.close();
	}

}
