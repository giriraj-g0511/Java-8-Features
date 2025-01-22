package localDateTime;

import java.time.LocalDateTime;

public class Example4 {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime addYears = ldt.plusYears(15);
		System.out.println("Current date " + ldt);
		System.out.println("After 15 years date " + addYears);

	}
	
}
