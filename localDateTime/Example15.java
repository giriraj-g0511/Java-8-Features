package localDateTime;

import java.time.LocalDateTime;

public class Example15 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2029, 03, 10, 14, 45, 55, 05);
		LocalDateTime decHrs = date.minusHours(152);
		System.out.println("Future Date : "+date);
		System.out.println("152 Hours before date : "+decHrs);
	}

	
}
