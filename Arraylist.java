package Collection;
import java.util.*;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(10);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		//adds element to particular index
		list.add(0,1); //[1]
		list.add(1,3); //[1,3]
		
		//adds elements in an order
		list.add(2); //[1,3,2]
		list.add(5); //[1,3,2,5]
		list1.addAll(list);
		
		// removes element at an index 
		list.remove(0);  //[3,2,5]
		// adds list1 to list
		list.addAll(list1);  // [3,2,5,1,3,2,5]

		// to get index of an element
		list.indexOf(2); // 1
		list.lastIndexOf(2); //5
		
		// remove element at an index
		list.remove(0);//[2, 5, 1, 3, 2, 5]

		// to know the value at particular index
//		System.out.println(list.get(4)); // 3
		
		// to replace an element with other element
		list.set(0,4); //[4, 2, 5, 1, 3, 2, 5]
		
		// to print  size
		int m=list.size();
		System.out.println(m); //6
	
	
	}
}
