package localDateTime;

import java.time.LocalDateTime;

public class Example9 {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime addNanos = ldt.plusNanos(80000000);
		System.out.println("Current date " + ldt);
		System.out.println("After 80000000 nano seconds date " + addNanos);

	}
	
}
