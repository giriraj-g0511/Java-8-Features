package localDateTime;

import java.time.LocalDateTime;

public class Example14 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2029, 03, 10, 14, 45, 55, 05);
		LocalDateTime decYears = date.minusYears(4);
		System.out.println("Future Date : "+date);
		System.out.println("4 Years before date : "+decYears);
	}

	
}
