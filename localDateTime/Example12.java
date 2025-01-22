package localDateTime;

import java.time.LocalDateTime;

public class Example12 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2029, 03, 10, 14, 45, 55, 05);
		LocalDateTime decMon = date.minusMonths(22);
		System.out.println("Future Date : "+date);
		System.out.println("22 Months before date : "+decMon);
	}

	
}
