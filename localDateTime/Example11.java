package localDateTime;

import java.time.LocalDateTime;

public class Example11 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2029, 03, 10, 14, 45, 55, 05);
		LocalDateTime decDays = date.minusDays(122);
		System.out.println("Future Date : "+date);
		System.out.println("122 Days before date : "+decDays);
	}
	
}
