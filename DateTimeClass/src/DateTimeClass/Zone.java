package DateTimeClass;
import java.time.*;
import java.util.*;

public class Zone {

	public static void main(String[] args) {
		// to get Zoneids
//		System.out.println(ZoneId.getAvailableZoneIds());
		
		
		// to get default zone id
		ZoneId zone=ZoneId.systemDefault();
//		System.out.println(zone);// Asia/Calcutta
		
		// can asaign any zone id and get time and date there
		ZoneId zone1=ZoneId.of("Asia/Calcutta");
		ZonedDateTime zdatetime=ZonedDateTime.now(zone1);
		System.out.println(zdatetime); // 2021-05-03T17:34:18.106392+05:30[Asia/Calcutta]
	}

}
class TimeZone1{
	public static void main(String[] args) {
		String[] zoneid=TimeZone.getAvailableIDs();
		 for (int i=0; i<zoneid.length; i++){  
//			   System.out.println(zoneid[i]);
		 }
		 TimeZone zone=TimeZone.getDefault();// gives default 
//		 System.out.println(zone);
		 TimeZone zone1=TimeZone.getTimeZone("Asia/Kolkata"); // gives time zone of corresponding time zone mentioned
//		 System.out.println(zone1);
		 System.out.println(zone1.getID());
		 String name = zone1.getDisplayName();
		 System.out.println(name);
		 
	}
}
