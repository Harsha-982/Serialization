package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList arrlist=new ArrayList();// intial capacity is 10
		LinkedList linkedlist =new LinkedList();
		//can add any type of object
		arrlist.add('a');
		arrlist.add('a');
		arrlist.add(true);
		arrlist.add(null);
		
		// to check whether it is empty or not
		System.out.println(arrlist.isEmpty());//false
		System.out.println(arrlist.contains('a'));//true
		
		System.out.println(arrlist instanceof RandomAccess); // true
		System.out.println(linkedlist instanceof RandomAccess); // false
	}
}

class Synchronizing{
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		List l =Collections.synchronizedList(list);
	}
}
