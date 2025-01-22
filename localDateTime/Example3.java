package localDateTime;

import java.time.LocalDateTime;

public class Example3 {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime addMonths = ldt.plusMonths(50);
		System.out.println("Current date " + ldt);
		System.out.println("After 50 months date " + addMonths);

	}
	
}
