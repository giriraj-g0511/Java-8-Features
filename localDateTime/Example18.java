package localDateTime;

import java.time.LocalDateTime;

public class Example18 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2029, 03, 10, 14, 45, 55, 05);
		LocalDateTime decNanos = date.minusNanos(95406703);
		System.out.println("Future Date : "+date);
		System.out.println("95406703 Nano Seconds before date : "+decNanos);
	}
}
