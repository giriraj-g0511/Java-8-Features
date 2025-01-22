package localDateTime;

import java.time.LocalDateTime;

public class Example8 {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime addSec = ldt.plusSeconds(4);
		System.out.println("Current date " + ldt);
		System.out.println("After 4 seconds date " + addSec);

	}
	
}
