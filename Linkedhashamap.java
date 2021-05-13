package Map;
import java.util.*;
public class Linkedhashamap {

	public static void main(String[] args) {
		LinkedHashMap linkedmap=new LinkedHashMap();
		Integer integer1=new Integer(10);
		Integer integer2=new Integer(10);
		linkedmap.put(16,"Subbarao");
		linkedmap.put(11,"Harsha");
		linkedmap.put(12,"Usha");
		linkedmap.put(13,"Padma");
		linkedmap.put(integer2,"Narun");
		System.out.println(linkedmap.put(integer1,"jash"));//Narun
		System.out.println(linkedmap);//{16=Subbarao, 11=Harsha, 12=Usha, 13=Padma, 10=jash}
	}
}

class Identityhashmap{
	public static void main(String[] args) {
		IdentityHashMap identity=new IdentityHashMap();
		Integer integer1=new Integer(10);
		Integer integer2=new Integer(10);
		identity.put(16,"Subbarao");
		identity.put(11,"Harsha");
		identity.put(12,"Usha");
		identity.put(13,"Padma");
		identity.put(integer2,"Narun");
		System.out.println(identity.put(integer1,"jash"));//null
		System.out.println(identity);//{10=Narun, 10=jash, 12=Usha, 16=Subbarao, 11=Harsha, 13=Padma}
	}
}