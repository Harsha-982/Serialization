package Collection;
import java.util.LinkedList;

public class Linkedlist {
	
	//add,remove,set,get
	//addFirst,addLast,removeFirst,removeLast
	
	public static void main(String[] args) {
		LinkedList linkedlist=new LinkedList();
		linkedlist.add(0); //[0]
		linkedlist.addFirst(1);// [1,0]
		linkedlist.add(0,"hi"); //[hi,1,0]
		linkedlist.set(1,"harsha");//[hi,harsha,0]
		linkedlist.removeLast(); //[hi,harsha]
		System.out.println(linkedlist.get(1));//harsha
		System.out.println(linkedlist);
		linkedlist.clear();
	}
}
