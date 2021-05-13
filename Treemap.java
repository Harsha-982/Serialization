package Map;
import java.util.Comparator;
import java.util.TreeMap;
public class Treemap {

	public static void main(String[] args) {
		TreeMap tree=new TreeMap();
		tree.put(10,'a');
		tree.put(11,'b');
		tree.put(12,'c');
		tree.put(13,'d');
		tree.put(14,'e');
		tree.put(15,16);
		System.out.println(tree.keySet());// prints keys....
		System.out.println(tree.get(10)); // a
//		tree.put("tree",10); ClassCastException
//		tree.put(null,19);  NullPointerException
		
		System.out.println(tree.firstKey());        //10
		System.out.println(tree.headMap(14));		//{10=a, 11=b, 12=c, 13=d}
		System.out.println(tree.tailMap(14));       //{14=e, 15=f}
		System.out.println(tree.subMap(10,13));     //{10=a, 11=b, 12=c}
		System.out.println(tree.comparator());  	//null
		}

}
class Treemap1{
	public static void main(String[] args) {
		TreeMap<Integer,Character> tree=new TreeMap<Integer,Character>(new MyTree());
		tree.put(10,'a');
		tree.put(11,'b');
		tree.put(27,'c');
		tree.put(13,'d');
		tree.put(14,'e');
		tree.put(15,'f');
		System.out.println(tree.higherEntry(14)); // >element ==>15=f
		System.out.println(tree.lowerEntry(14));  //<element ==>13=d
		System.out.println(tree.ceilingEntry(14)); //<=element ==>14=e
		System.out.println(tree.floorEntry(14));    //>=element ==>14=e
		System.out.println(tree); //{10=a, 11=b, 13=d, 14=e, 15=f, 27=c}
		System.out.println(tree.descendingMap());  // gives opposite to the present sorting {27=c, 15=f, 14=e, 13=d, 11=b, 10=a}
	}
}

class MyTree implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String str1=obj1.toString();
		String str2=obj2.toString();
		return str1.compareTo(str2);
//		Integer i=(Integer)obj1;
//		Integer i1=(Integer)obj2;
//		return -i.compareTo(i1);
		
	}
}
