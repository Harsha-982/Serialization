package Map;
import java.util.*;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		HashMap hashmap=new HashMap();//default capacity is 16, fill ratio is 0.75
//		HashMap hashmap1=new HashMap(10); // can have intial values
//		HashMap hashmap2=new HashMap(10,0.9f); // intitial  and fill ratio even
//		HashMap hashmap3=new HashMap(Map m);
		
		hashmap.put("Harish",30);
		hashmap.put("Satya",31);
		hashmap.put("Dev",32);
		hashmap.put("Tarun",29);
		hashmap.remove("Harish");
		hashmap.containsKey("Dev");
		System.out.println(hashmap.put("Tarun",78));  //returns 29 ==> its previous value
		//produces output as set
		System.out.println(hashmap);  //{Satya=31, Tarun=78, Dev=32}
		
		
		Set keys=hashmap.keySet();
		System.out.println(keys);// returns a set of keys {Satya=31, Tarun=78, Dev=32}
//		System.out.println(hashmap.keySet()); same output as before....
		Collection values=hashmap.values();
		System.out.println(values); //returns a collection of values [31, 78, 32]
		Set keyvalue=hashmap.entrySet();
		System.out.println(keyvalue);
		System.out.println();
		
		Iterator itr=keyvalue.iterator();
		while(itr.hasNext()) {
			Map.Entry mapentry=(Entry) itr.next();
			if(mapentry.getKey().equals("Tarun")) {
				mapentry.setValue("Tarun Bhaskar");}
				System.out.println(mapentry);
		}
	}
}

class Synchronized{
	public static void main(String[] args) {
		HashMap hashmap=new HashMap();
		Map m=Collections.synchronizedMap(hashmap);
	}
}
