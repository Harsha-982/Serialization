package DateTimeClass;

import java.time.*;

public class DateTimeClass {

	public static void main(String[] args) {
		// to get current date
		LocalDate date=LocalDate.now();
//		System.out.println(date);
		// to get current time
		LocalTime time=LocalTime.now();
//		System.out.println(time);
		// to get current date and time
		LocalDateTime datetime=LocalDateTime.now();
//		 System.out.println(datetime);
		 //to get every thing seperately we use this methods in time package
		 int dd=date.getDayOfMonth();
		 int mm=date.getMonthValue();
		 int yyyy=date.getYear();
//		 System.out.println(dd+"-"+mm+"-"+yyyy);
		 
		 int hour=time.getHour();
		 int min=time.getMinute();
		 int sec=time.getSecond();
		 int nano=time.getNano();
		 
//		 System.out.printf("%d:%d:%d:%d",hour,min,sec,nano); 
		 
		 //to get time at some other instance
		LocalDateTime datetime1=LocalDateTime.of(1999,Month.FEBRUARY,17,04,34);
		System.out.println(datetime1);
		// to get date & time after 3 months
		System.out.println("After 3 months: " +date.plusMonths(3)+" "+datetime.plusDays(5));//for before minus

	}

}

class PeriodYear{
	public static void main(String[] args) {
		LocalDate bdy=LocalDate.of(2000,Month.FEBRUARY,17);
		LocalDate today=LocalDate.now();
		
		Period p=Period.between(bdy,today);
		System.out.printf("%d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
		Year yyyy=Year.of(2001);
		Year nextyear=Year.of(2000);
		if(yyyy.isAfter(nextyear) && nextyear.isLeap()) {
			System.out.println("\nyes");
		}
		else {
			System.out.println("\nno");
		}
	}
}
