package DateTimeClass;
import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
		// provides information about this instance
		Calendar cal= Calendar.getInstance();
//		System.out.println(cal);
		//to get time
		System.out.println(cal.getTime()); // Mon May 03 time IST 2021

		
		// get method
		System.out.println(cal.get(Calendar.MONTH));// month starts from 0 so u will get 4 for may
		System.out.println(cal.get(Calendar.YEAR));// 2021
		System.out.println(cal.get(Calendar.DATE));
		
		//getMaximum 
		System.out.println(cal.getMaximum(Calendar.DAY_OF_WEEK)); // maximum no of days in a week
		System.out.println(cal.getMaximum(Calendar.DAY_OF_MONTH));// maxiumum no of days in a month
		System.out.println(cal.getMaximum(Calendar.SECOND));
		
		//getMinimum opposite of getMaximum
		System.out.println(cal.getMinimum(Calendar.DAY_OF_WEEK));
		System.out.println(cal.getMinimum(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getMinimum(Calendar.SECOND));
		
		//add method
		cal.add(Calendar.DATE,10);
		System.out.println(cal.getTime()); // current date 3 after 10 days 13
		cal.add(Calendar.DATE,-2); // current date 3 but we already changed to 13 so output is 11
		System.out.println(cal.getTime());
		
	}

}
