package localDateTime;

import java.time.LocalDateTime;

public class Example6 {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime addHour = ldt.plusHours(8);
		System.out.println("Current date " + ldt);
		System.out.println("After 8 hours date " + addHour);

	}
	
}
