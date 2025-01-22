package localDateTime;

import java.time.LocalDateTime;

public class Example7 {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime addMins = ldt.plusMinutes(4);
		System.out.println("Current date " + ldt);
		System.out.println("After 4 minutes date " + addMins);

	}
	
}
