package localDateTime;

import java.time.LocalDateTime;

public class Example2 {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime addDays = ldt.plusDays(5);
		System.out.println("Current date " + ldt);
		System.out.println("After 5 days date " + addDays);

	}
	
}
