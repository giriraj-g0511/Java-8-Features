package localDateTime;

import java.time.LocalDateTime;

public class Example17 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2029, 03, 10, 14, 45, 55, 05);
		LocalDateTime decSecs = date.minusSeconds(90);
		System.out.println("Future Date : "+date);
		System.out.println("90 Seconds before date : "+decSecs);
	}

	
}
