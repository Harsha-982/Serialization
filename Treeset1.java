package Collection;
import java.util.Comparator;
import java.util.TreeSet;
public class Treeset1 {

	//add,remove,get
	//first,headSet,tailSet,subSet,comparator,last
	//lower,floor,higher,ceiling,desecending set  (navigable set)
	
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>(new MySorting());
		ts.add(10);
		ts.add(2);
		ts.add(39);
		ts.add(1);
		ts.add(5);
		System.out.println(ts.lower(5));// 10   first element just before 5
		System.out.println(ts.floor(5));// 5    if 5 is there then 5 or before 5
		System.out.println(ts.higher(5));//2    first element after 5
		System.out.println(ts.ceiling(6));//5	opposite to floor 
		System.out.println(ts);
		System.out.println(ts.descendingSet()); //gives reverse order==>if asscending gives descending
	 	
	}

}
class MySorting implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer obj1=(Integer)o1;
		Integer obj2=(Integer)o2;
//		if(obj1>obj2) {
//			return -1;
//		}
//		else if(obj1<obj2) {
//			return 1;
//		}
//		else
//			return 0;	
		return -obj2.compareTo(obj1);
	}
}

class Treeset2{
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		for(int i=0;i<10;i++) {
			ts.add(i);
		}
		System.out.println(ts.first());
		System.out.println(ts.headSet(5));
		System.out.println(ts.tailSet(5));
		System.out.println(ts.subSet(2,7));
		System.out.println(ts.comparator());
	}
}
