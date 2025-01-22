package localDateTime;

import java.time.LocalDateTime;

public class Example13 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2029, 03, 10, 14, 45, 55, 05);
		LocalDateTime decWeeks = date.minusWeeks(82);
		System.out.println("Future Date : "+date);
		System.out.println("82 Weeks before date : "+decWeeks);
	}

	
}
