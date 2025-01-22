package localDateTime;

import java.time.LocalDateTime;

public class Example5 {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime addWeeks = ldt.plusWeeks(7);
		System.out.println("Current date " + ldt);
		System.out.println("After 7 weeks date " + addWeeks);

	}
	
}
