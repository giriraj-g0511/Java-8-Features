package localDateTime;

import java.time.LocalDateTime;

public class Example16 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2029, 03, 10, 14, 45, 55, 05);
		LocalDateTime decMins = date.minusMinutes(80);
		System.out.println("Future Date : "+date);
		System.out.println("80 Minutes before date : "+decMins);
	}

	
}
