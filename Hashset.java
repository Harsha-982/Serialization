package Collection;
import java.util.*;
public class Hashset {
	public static void main(String[] args) {
		//HashSet hs=new HashSet();  // default 10
		HashSet hs=new HashSet(10);
		
		LinkedHashSet linkedhs=new LinkedHashSet();
		
		hs.add("harsha");
		hs.add("ab");
		hs.add('b');
		hs.add("ts");
		hs.add('a');
		hs.remove('d');
		System.out.println(hs.add('a'));// returns false because set cannot have duplicate elements
		System.out.println(hs);
		
		linkedhs.add("harsha");
		linkedhs.add("ab");
		linkedhs.add('b');
		linkedhs.add("ts");
		linkedhs.add('a');
		linkedhs.remove('d');
		System.out.println(linkedhs);
	}
}

class Treeset{
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(2);
		ts.add(3);
		ts.add(19);
		ts.add(11);
//		ts.add("A");"ClassCastException
		System.out.println(ts);
	}
}
