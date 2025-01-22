package localDateTime;

import java.time.LocalDateTime;

public class Example1 {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		int hh = ldt.getHour();
		int mm = ldt.getMinute();
		int ss = ldt.getSecond();
		
		int year = ldt.getYear();
		int month = ldt.getMonthValue();
		int dd = ldt.getDayOfMonth();
		
		System.out.println("Local Date Time : "+ldt);
		System.out.printf("Time is %d:%d:%d\n",hh,mm,ss);
		System.out.printf("Date is %d:%d:%d",year,month,dd);
		
		
		
	}

}
